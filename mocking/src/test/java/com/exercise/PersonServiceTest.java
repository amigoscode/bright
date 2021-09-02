package com.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    // TODO: Annotate this with @Mock
    private PersonDAO personDAO;
    private PersonService underTest;

    @BeforeEach
    void setUp() {
        // TODO: Uncomment line bellow to initialise mocks
        // MockitoAnnotations.openMocks(this);
        // TODO: pass mock into PersonService constructor
        // underTest = new PersonService()
    }

    /*
       TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

//    Good luck :)

    @Test
    void itCanSavePerson() {
    }

    @Test
    void itCanDeletePerson() {
    }

    @Test
    void canGetPeopleFromDB() {
    }

    @Test
    void canGetPersonById() {
    }
}