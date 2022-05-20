package kr.co.patternbot.soccer.serivices;

import kr.co.patternbot.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    List<Team> findAll();

    List<Team> findAll(Sort sort);

    Page<Team> findAll(Pageable pageable);

    long count();

    String delete(Team player);

    String save(Team player);

    Optional<Team> findById(String playerid);

    boolean existsById(String playerid);
}
