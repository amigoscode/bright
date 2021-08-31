package com.amigoscode.vehicleexample;

public class Car implements Vehicle {

    private String brand;
    private int speed;


    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void move(int speed) {
        System.out.println("start engine");
        System.out.println("change gears");
        System.out.println("accelerate");
        this.speed += speed;

    }

    @Override
    public void applyBreaks() {
        System.out.println("press breaks with foot");
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}
