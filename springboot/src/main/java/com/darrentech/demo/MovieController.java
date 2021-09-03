package com.darrentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/movies")
public class MovieController {

    @GetMapping
    public List<Movie> listMovies() {
        SuperHero ironMan = new SuperHero("IronMan", "Rich/Intelligent");
        SuperHero hulk = new SuperHero("Hulk", "Strength");

        Movie movie = new Movie(
                "Iron Man",
                List.of(ironMan, hulk),
                LocalDate.of(2017, 1 , 25));

        return List.of(movie);
    }

    @GetMapping(path = "say-hi")
    public List<Country> sayHi() {
        return List.of(new Country("PT"), new Country("IT"));
    }

    static class Country {
        private String name;

        public Country(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
