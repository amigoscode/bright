package com.yulintech;

import java.util.List;

public class CarRentalService {
    private CarRentalDB carRentalDB;

    public CarRentalService(CarRentalDB carRentalDB) {
        this.carRentalDB = carRentalDB;
    }

    public void createNewCar(String plate, String brand) {
        if (!plate.equals("")) {
            int result = carRentalDB.saveCar(new Car(plate, brand));
            System.out.println(result);
        } else {

            throw new IllegalStateException("plate was empty");
        }
    }

    public List<Car> getAllCars() {
        return carRentalDB.getAllCars();
    }
}
