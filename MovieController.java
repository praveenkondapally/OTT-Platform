package com.devops.ott.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public List<Map<String,String>> getMovies() {

        List<Map<String,String>> movies = new ArrayList<>();

        movies.add(
                Map.of(
                        "title","Bahubali",
                        "language","Telugu"
                )
        );

        movies.add(
                Map.of(
                        "title","RRR",
                        "language","Telugu"
                )
        );

        movies.add(
                Map.of(
                        "title","Pushpa",
                        "language","Telugu"
                )
        );

        return movies;
    }
}
