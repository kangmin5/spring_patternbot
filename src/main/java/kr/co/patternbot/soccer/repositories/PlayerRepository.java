package kr.co.patternbot.soccer.repositories;

import kr.co.patternbot.soccer.domains.Player;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

interface PlayerCustomRepository{
    //선수들 키와 몸무게를 변경하시오.
}
@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

}
