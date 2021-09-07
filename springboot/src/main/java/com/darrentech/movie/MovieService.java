package com.darrentech.movie;

import com.darrentech.exception.MovieNotFoundException;
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

    public void deleteMovie(String movieName) {
        List<Movie> movies = movieDataAccessService.selectAllMoviesMovies();
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getName().equals(movieName)) {
                found = true;
                movieDataAccessService.deleteMovie(movie);
            }
        }
        if (!found) {
            throw new MovieNotFoundException(movieName + " not found");
        }
    }

    public Movie getMovie(String movieName) {
        return movieDataAccessService.selectAllMoviesMovies()
                .stream()
                .filter(movie -> movie.getName().equals(movieName))
                .findFirst()
                .orElseThrow(() -> new MovieNotFoundException(movieName + " not found"));

//        List<Movie> movies = movieDataAccessService.selectAllMoviesMovies();
//        for (Movie movie : movies) {
//            if (movie.getName().equals(movieName)) {
//                return movie;
//            }
//        }
//        throw new MovieNotFoundException(movieName + " not found");
    }

    private boolean doesMovieExists(String movieName) {
        return movieDataAccessService.selectAllMoviesMovies()
                .stream()
                .anyMatch(movie -> movie.getName().equals(movieName));
    }

    public void updateMovie(Movie movie) {
        List<Movie> movies = movieDataAccessService.selectAllMoviesMovies();
        boolean found = false;
        for (Movie m : movies) {
            if (m.getName().equals(movie.getName())) {
                found = true;
                m.setSuperHeroes(movie.getSuperHeroes());
                m.setReleaseDate(movie.getReleaseDate());
            }
        }
        if (!found) {
            throw new MovieNotFoundException(movie.getName() + " not found");
        }
    }
}
