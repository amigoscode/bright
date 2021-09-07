package com.darrentech.movie;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDataAccessServicePostgres {

    private JdbcTemplate jdbcTemplate;

    public MovieDataAccessServicePostgres(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Movie> selectAllMoviesMovies() {
        return null;
    }

    public int insertMovie(Movie movie) {
        String insertSql = """
        INSERT INTO movie(movie_name, release_date) VALUES(?, ?)
        """;
        int result = jdbcTemplate.update(insertSql, movie.getName(), movie.getReleaseDate());
        return result;
    }

    public void deleteMovie(Movie movie) {

    }
    
}
