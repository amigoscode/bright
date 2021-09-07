package com.darrentech.movie;

public class BiancaService {

    private MovieService movieService;

    public BiancaService() {
        this.movieService = new MovieService(null, null);
    }
}
