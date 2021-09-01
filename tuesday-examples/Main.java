package com.amigoscode;


import com.amigoscode.house.House;
import com.amigoscode.person.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public void sayHello(Animal animal) {
        System.out.println(animal.getEyeColor());
    }
    
    
    public static void main(String[] args) {

    }

    private static void extracted() {
        House house = new House(20, true);

        Car car = new Car("Tesla", "Amigoscode");
        Car car2 = new Car("Ferrari", "AmigoscodeF");

        List<Car> cars = List.of(car);
        Garage garage = new Garage(cars);

        house.setGarage(garage);
    }

}
