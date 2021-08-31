package com.amigoscode;

import java.util.List;
import java.util.Objects;

public class Garage {

    private List<Car> car;

    public Garage(List<Car> car) {
        this.car = car;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "car=" + car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(car, garage.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car);
    }
}
