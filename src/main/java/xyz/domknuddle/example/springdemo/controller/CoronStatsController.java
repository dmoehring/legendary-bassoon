package xyz.domknuddle.example.springdemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.domknuddle.example.springdemo.models.CoronaStats;
import xyz.domknuddle.example.springdemo.repositories.CoronaStatsRepository;

import java.util.List;

@RestController
public class CoronStatsController {
    private final CoronaStatsRepository repository;

    CoronStatsController(CoronaStatsRepository repository) {
        this.repository = repository;
    }

//Pagination
    @GetMapping("/coronastats")
    public List<CoronaStats> getCoronaStats(@RequestParam String ort) {
        if(ort != null)
            return repository.findByOrt(ort);

        return repository.findAll();
    }

}
