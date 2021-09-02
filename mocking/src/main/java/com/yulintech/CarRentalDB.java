package com.yulintech;

import java.util.List;

public interface CarRentalDB {
    int saveCar(Car car);
    List<Car> getAllCars();
}
