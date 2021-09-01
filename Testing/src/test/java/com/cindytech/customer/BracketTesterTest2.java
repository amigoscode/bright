package com.cindytech.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class BracketTesterTest2 {

    private BracketTester underTest;

    @BeforeEach
    void setUp() {
        underTest = new BracketTester();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "()", "({})", "[]", "({{}})",  "({{([{[[]]}])}})"
    })
    void checkCorrectBrackets(String bracket) {
        // When
        boolean actual = underTest.checkParentheses(bracket);

        // Then
        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {
             ","
    })
    void checkWrongBrackets(String bracket) {
        // When
        boolean actual = underTest.checkParentheses(bracket);

        // Then
        assertThat(actual).isFalse();
    }
}