package com.cindytech.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {

    private Calculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new Calculator();
    }

    @Test
    void itShouldAddTwoNumbers() {
        int actual = underTest.add(10, 10);
        int expected = 20;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void itShouldSubTwoNumbers() {
        int actual = underTest.subtract(10, 10);
        int expected = 0;

        assertThat(actual).isEqualTo(expected);
    }

}