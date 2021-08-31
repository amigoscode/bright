package com.amigoscode.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(this.getName() + "is barking...");
    }

}
