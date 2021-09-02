package com.yulintech;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarRentalServiceTest {

    @Mock
    private CarRentalDB carRentalDB;

    private CarRentalService underTest;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        underTest = new CarRentalService(carRentalDB);
    }

    @Test
    void addNewCar() {
        // Given
        String plate = "1234";
        String brand = "tesla";

        // When
        Mockito.when(carRentalDB.saveCar(Mockito.any(Car.class)))
                .thenReturn(1);

        underTest.createNewCar(plate, brand);

        // Then
        ArgumentCaptor<Car> carArgumentCaptor = ArgumentCaptor.forClass(Car.class);
        Mockito.verify(carRentalDB).saveCar(carArgumentCaptor.capture());

        Car car = carArgumentCaptor.getValue();
        assertThat(car.getBrand()).isEqualTo("tesla");
        assertThat(car.getPlate()).isEqualTo("1234");
    }

    @Test
    void willNotAddCarWhenPlateIsEmpty() {
        // Given
        String plate = "";
        String brand = "";

        // When
        assertThatThrownBy(() -> {
            underTest.createNewCar(plate, brand);
        }).hasMessage("plate was empty");

        // Then
        Mockito.verifyNoInteractions(carRentalDB);
    }

    @Test
    void canSelectAllCars() {
        // Given
        List<Car> cars = List.of(
                new Car("www", "tesla"),
                new Car("ooo", "mercedes"));

        Mockito.when(carRentalDB.getAllCars()).thenReturn(cars);

        // When
        List<Car> allCars = underTest.getAllCars();

        // Then
        assertThat(allCars).isEqualTo(cars);

    }
}