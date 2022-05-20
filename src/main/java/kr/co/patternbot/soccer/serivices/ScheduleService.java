package kr.co.patternbot.soccer.serivices;

import kr.co.patternbot.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface ScheduleService {
    List<Schedule> findAll();

    List<Schedule> findAll(Sort sort);

    Page<Schedule> findAll(Pageable pageable);

    long count();

    String delete(Schedule player);

    String save(Schedule player);

    Optional<Schedule> findById(String playerid);

    boolean existsById(String playerid);
}
