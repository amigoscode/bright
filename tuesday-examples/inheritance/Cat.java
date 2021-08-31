package com.amigoscode.inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(this.getName() + " is meowing...");
    }

}
