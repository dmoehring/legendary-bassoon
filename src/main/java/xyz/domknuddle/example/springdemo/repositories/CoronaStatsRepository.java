package xyz.domknuddle.example.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.domknuddle.example.springdemo.models.CoronaStats;
import xyz.domknuddle.example.springdemo.models.CoronaStatsPk;

import java.util.List;

public interface CoronaStatsRepository extends JpaRepository<CoronaStats, CoronaStatsPk> {

    List<CoronaStats> findByOrt(String ort);

}
