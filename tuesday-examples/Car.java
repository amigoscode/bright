package com.amigoscode;

import java.util.Objects;

public class Car extends Vehicle {
    private String make;
    private String planeNumber;

    public Car(String make, String planeNumber) {
        this.make = make;
        this.planeNumber = planeNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(planeNumber, car.planeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, planeNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", planeNumber='" + planeNumber + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(String planeNumber) {
        this.planeNumber = planeNumber;
    }
}
