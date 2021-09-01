package com.amigoscode.vehicleexample;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla", 0);

        Person person = new Person("Cindy", car);
        person.getVehicle().move(100);
        person.getVehicle().applyBreaks();

        Bicycle bicycle = new Bicycle("BMX", 0);

        person.setVehicle(bicycle);
        person.getVehicle().move(100);
        person.getVehicle().applyBreaks();

        System.out.println("Binca " + "Navey");
        System.out.println(1 + 1);

        List<Vehicle> vehicles = List.of(car, bicycle);
        print(vehicles);
    }

    public static void print(List<Vehicle> vehicles) {
        vehicles.forEach(v -> {
            v.move(10);
            v.applyBreaks();
        });
    }
}
