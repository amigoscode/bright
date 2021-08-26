package com.amigoscode.house;

import com.amigoscode.Garage;
import com.amigoscode.address.Address;
import com.amigoscode.person.Person;

import java.util.List;
import java.util.Objects;

public class House {
    private int houseNumber;
    private boolean hasSwimmingPool;
    private Garage garage;
    private List<Person> people;
    private Address address;

    public House(int houseNumber, boolean hasSwimmingPool, Garage garage) {
        this.houseNumber = houseNumber;
        this.hasSwimmingPool = hasSwimmingPool;
        this.garage = garage;
    }

    public House(int houseNumber, boolean hasSwimmingPool) {
        this.houseNumber = houseNumber;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return houseNumber == house.houseNumber && hasSwimmingPool == house.hasSwimmingPool && Objects.equals(garage, house.garage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, hasSwimmingPool, garage);
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNumber=" + houseNumber +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", garage=" + garage +
                '}';
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }
}
