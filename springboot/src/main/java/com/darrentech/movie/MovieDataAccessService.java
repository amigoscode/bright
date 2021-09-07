package com.darrentech.movie;

import com.darrentech.superhero.SuperHero;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDataAccessService {

    private static List<Movie> db;

    public MovieDataAccessService() {
        SuperHero ironMan = new SuperHero("IronMan", "Rich/Intelligent");
        SuperHero hulk = new SuperHero("Hulk", "Strength");

        Movie movie = new Movie(
                "Iron Man",
                List.of(ironMan, hulk),
                LocalDate.of(2017, 1 , 25));

        db = new ArrayList<>();
        db.add(movie);
    }

    public List<Movie> selectAllMoviesMovies() {
        return db;
    }

    public void insertMovie(Movie movie) {
        db.add(movie);
    }

    public void deleteMovie(Movie movie) {
        db.remove(movie);
    }
    
}
