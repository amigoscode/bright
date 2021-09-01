package com.amigoscode.ds;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Cindy"));
        map.put(2, new Person("Samira"));

        List<String> pringles = new Stack<>();

        Queue<Person> lidlQueue = new LinkedList<>();
        lidlQueue.add(new Person("Cindy"));
        lidlQueue.add(new Person("Samira"));
    }

    static class Person {
        String name;

        public Person(String cindy) {
        }
    }
}
