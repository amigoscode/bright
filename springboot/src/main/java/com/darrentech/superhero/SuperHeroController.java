package com.darrentech.superhero;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/superhero")
public class SuperHeroController {

    @GetMapping
    public List<SuperHero> listSuperHero() {
        SuperHero ironMan = new SuperHero("IronMan", "Rich/Intelligent");
        SuperHero hulk = new SuperHero("Hulk", "Strength");
        return List.of(ironMan, hulk);
    }

    @DeleteMapping
    public void deleteMovies(String superHeroName) {

    }



}
