package kr.co.patternbot.soccer.serivices;

import kr.co.patternbot.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface StadiumService {
    List<Stadium> findAll();

    List<Stadium> findAll(Sort sort);

    Page<Stadium> findAll(Pageable pageable);

    long count();

    String delete(Stadium player);

    String save(Stadium player);

    Optional<Stadium> findById(String playerid);

    boolean existsById(String playerid);
}
