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
        return movieDataAccessService.selectAllMoviesMovies();
    }

    public void addNewMovie(Movie movie) {
        // TODO: check if movie exists
        movieDataAccessService.insertMovie(movie);
    }
}
