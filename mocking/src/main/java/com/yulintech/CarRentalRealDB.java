package com.yulintech;

import java.util.List;

public class CarRentalRealDB implements CarRentalDB {
    @Override
    public int saveCar(Car car) {
        System.out.println("connecting...");
        System.out.println("prepared statement");
        System.out.println("execute");
        System.out.println("close connection");
        return 0;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }
}
