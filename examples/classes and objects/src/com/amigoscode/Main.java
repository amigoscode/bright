package com.amigoscode;


import com.amigoscode.house.House;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static void sayHello(Animal animal) {
        System.out.println(animal.getEyeColor());
    }
    
    
    public static void main(String[] args) {

        Animal huskey = new Dog("red");
        Animal cat = new Cat("blue");

        System.out.println(huskey.getEyeColor());
        System.out.println(cat.getEyeColor());


//        sayHello(huskey);
//        sayHello(cat);
//
//
//        List<Car> cars = new ArrayList();
//        cars.add( new Car("Tesla", "Amigoscode"));
//        cars.add( new Car("Tesla", "Amigoscode"));
//        cars.add( new Car("Tesla", "Amigoscode"));
//
//        cars.add( new Car("Tesla", "Amigoscode"));
//
//        List<Car> cars1 = List.of(
//                new Car("Tesla", "Amigoscode"),
//                new Car("Tesla", "Amigoscode"),
//                new Car("Tesla", "Amigoscode"),
//                new Car("Tesla", "Amigoscode")
//        );
//
//        List<String> names = new LinkedList<>();
//        names.add("dasdsas");
//
//        cars.forEach(car -> {
//            System.out.println(car.getMake());
//        });


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
