package com.amigoscode.vehicleexample;

public class Bicycle implements Vehicle {

    private String brand;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    private int speed;

    @Override
    public void move(int speed) {
        this.speed += speed;
        if (this.speed > 30) {
            throw new IllegalStateException("Ooops you are going to fast");
        }
        System.out.println("pedal");


    }

    @Override
    public void applyBreaks() {
        System.out.println("press hand breaks");
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}
