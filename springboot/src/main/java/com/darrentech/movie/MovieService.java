package com.darrentech.movie;

import com.darrentech.superhero.SuperHero;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//MovieService movieService = new MovieService()
@Service
public class MovieService {

    private MovieDataAccessService movieDataAccessService;

    public MovieService(MovieDataAccessService movieDataAccessService) {
        this.movieDataAccessService = movieDataAccessService;
    }

    public List<Movie> getMovies() {
        SuperHero ironMan = new SuperHero("IronMan", "Rich/Intelligent");
        SuperHero hulk = new SuperHero("Hulk", "Strength");

        Movie movie = new Movie(
                "Iron Man",
                List.of(ironMan, hulk),
                LocalDate.of(2017, 1 , 25));

        return List.of(movie);
    }
}
