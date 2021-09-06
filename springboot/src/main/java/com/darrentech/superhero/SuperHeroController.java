package com.darrentech.superhero;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/superhero")
public class SuperHeroController {

    // TODO: Create SuperHeroService
    // TODO: Create SuperHeroDataAccessService
    // TODO: Use Dependency Injection to inject SuperHeroService

    @GetMapping
    public List<SuperHero> getSuperHero() {
        // TODO: Move the list of movies to a class called SuperHeroDataAccessService
        // TODO: Call SuperHeroService to give you the list of SuperHeros
        SuperHero ironMan = new SuperHero("IronMan", "Rich/Intelligent");
        SuperHero hulk = new SuperHero("Hulk", "Strength");
        return List.of(ironMan, hulk);
    }

    // i.e localhost:8080/api/superhero/hulk
    @GetMapping({"superHero"})
    public SuperHero getSuperHeroByName(@PathVariable("superHero") String superHeroName) {
        /*
            TODO: Find and return superHeroName in db if not present throw new SuperHeroNotFoundException("message");
            Note that business logic should be in SuperHeroService
         */
        return null;
    }

    // i.e DELETE localhost:8080/api/superhero/hulk
    @DeleteMapping("{superHero}")
    public void deleteSuperHero(@PathVariable("superHero") String superHeroName) {
        // TODO: Implement delete super hero
    }

    // TODO: Implement update superhero name

}
