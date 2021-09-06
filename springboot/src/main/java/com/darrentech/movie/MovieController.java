package com.darrentech.movie;

import com.darrentech.superhero.SuperHero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
//        movieService = new MovieService();
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> listMovies() {
        return movieService.getMovies();
    }

}
