package com.amigoscode.interfaces;

public class Car implements Vehicle {

    private int speed;
    private int gear;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(int speed) {
        this.gear++;
        System.out.println("changing gears to " + this.gear);
        System.out.println("accelerate");
        this.speed += speed;
    }

    @Override
    public void applyBreak(int amount) {
        System.out.println("press breaks with foot");
        this.speed -= amount;
    }
}
