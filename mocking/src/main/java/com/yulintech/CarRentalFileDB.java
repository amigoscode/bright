package com.yulintech;

import java.util.List;

public class CarRentalFileDB implements CarRentalDB {
    @Override
    public int saveCar(Car car) {
        System.out.println("Create file");
        System.out.println("Write file");
        return 0;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }
}
