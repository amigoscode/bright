package com.amigoscode.inheritance;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sleep() {
        System.out.println(name + " sleep...");
    }

    public void eat() {
        System.out.println(name + " eating...");
    }
}
