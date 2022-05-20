package kr.co.patternbot.auth.repositories;

import kr.co.patternbot.auth.domains.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;


interface UserCustomRepository{
    String login(User user);
    String update(User user);
}


@Repository
public interface UserRepository extends JpaRepository<User,Long> {


}
