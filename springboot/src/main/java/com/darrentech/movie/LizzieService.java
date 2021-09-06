package com.darrentech.movie;

import org.springframework.stereotype.Service;

@Service
public class LizzieService {

    private MovieService movieService;

    public LizzieService(MovieService movieService) {
        this.movieService = movieService;
    }
}
