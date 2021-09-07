package com.darrentech.movie;

import com.darrentech.superhero.SuperHero;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Movie {
    private String name;
    private List<SuperHero> superHeroes;
    private LocalDate releaseDate;

    public Movie(String name,
                 List<SuperHero> superHeroes,
                 LocalDate releaseDate) {
        this.name = name;
        this.superHeroes = superHeroes;
        this.releaseDate = releaseDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperHeroes(List<SuperHero> superHeroes) {
        this.superHeroes = superHeroes;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public List<SuperHero> getSuperHeroes() {
        return superHeroes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", superHeroes=" + superHeroes +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && Objects.equals(superHeroes, movie.superHeroes) && Objects.equals(releaseDate, movie.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, superHeroes, releaseDate);
    }

}
