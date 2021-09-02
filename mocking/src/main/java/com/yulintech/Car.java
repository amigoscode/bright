package com.yulintech;

public class Car {
    private String plate;
    private String brand;

    public Car(String plate, String brand) {
        this.plate = plate;
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
