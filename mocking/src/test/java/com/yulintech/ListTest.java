package com.yulintech;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void test() {
        List<String> strings = new ArrayList<>();
        strings.add("BincaN");
        System.out.println(strings.get(0));
        System.out.println(strings.size());
    }

    @Test
    void mock() {
        List strings = Mockito.mock(List.class);
        strings.add("BincaN");

        when(strings.get(0)).thenReturn("BincaN");
        when(strings.size()).thenReturn(1);

        System.out.println(strings.get(0));
        System.out.println(strings.size());
    }
}
