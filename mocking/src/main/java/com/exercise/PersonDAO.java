package com.exercise;

import java.util.List;
import java.util.Optional;

public interface PersonDAO {
    int savePerson(Person person);
    int deletePerson(int id);
    List<Person> getPeople();
    Optional<Person> getPersonById(int id);
}
