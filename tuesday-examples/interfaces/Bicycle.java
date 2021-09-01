package com.amigoscode.interfaces;

public class Bicycle implements Vehicle {

    private int speed;

    public Bicycle(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(int speed) {
        System.out.println("Pedaling");
        this.speed += speed;

    }

    @Override
    public void applyBreak(int amount) {
        System.out.println("Stop pedaling");
        System.out.println("Apply hand break");
        this.speed -= amount;
    }
}
