package com.darrentech.movie;

import com.darrentech.superhero.SuperHero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/movies")
public class MovieController {

    // TODO: Implement update movie

    private MovieService movieService;

    public MovieController(MovieService movieService) {
//        movieService = new MovieService();
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> listMovies() {
        return movieService.getMovies();
    }

    // i.e localhost:8080/api/superhero/hulk
    @GetMapping("{movieName}")
    public Movie getMovieByName(@PathVariable("movieName") String movieName) {
        /*
            TODO: Find and return superHeroName in db if not present throw new MovieNotFoundException("message");
            Note that business logic should be in MovieService
         */
        return movieService.getMovie(movieName);
    }

    /*
    @RequestBody
        {
            "name": "Fast 9",
            "releaseDate": "2021-01-25"
        }
        // map @RequestBody to an instance of Movie Class. Movie movie
     */

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        System.out.println(movie);
        movieService.addNewMovie(movie);
    }

    // i.e DELETE localhost:8080/api/movie/fast9
    @DeleteMapping("{movieName}")
    public void deleteMovies(@PathVariable("movieName") String movieName) {
        // TODO: Implement delete movie
        movieService.deleteMovie(movieName);
    }

    @PutMapping
    public void updateMovie(@RequestBody Movie movie) {
        movieService.updateMovie(movie);
    }

}
