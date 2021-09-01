package com.cindytech.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BracketTesterTest {

    private BracketTester underTest;

    @BeforeEach
    void setUp() {
        underTest = new BracketTester();
    }

    @Test
    void canCheckBracketsAreCorrect() {
        // Given
        String brackets = "({()})";

        // When
        boolean actual = underTest.check(brackets);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckBracketsAreCorrectWithSquareBracket() {
        // Given
        String brackets = "({([])})";

        // When
        boolean actual = underTest.check(brackets);

        // Then
        assertThat(actual).isTrue();
    }

    @Test
    void canCheckBracketsAreNotCorrect() {
        // Given
        String brackets = "({()}";

        // When
        boolean actual = underTest.check(brackets);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckNonBrackets() {
        // Given
        String brackets = "x";

        // When
        boolean actual = underTest.check(brackets);

        // Then
        assertThat(actual).isFalse();
    }

    @Test
    void canCheckNumbersBrackets() {
        // Given
        String brackets = "33";

        // When
        boolean actual = underTest.check(brackets);

        // Then
        assertThat(actual).isFalse();
    }


    @Test
    void canCheckEmptyBrackets() {
        // Given
        String brackets = "";

        // When
        boolean actual = underTest.check(brackets);

        // Then
        assertThat(actual).isFalse();
    }
}