package com.amigoscode.person;

import com.amigoscode.Gender;
import com.amigoscode.address.Address;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private Address address;
    private List<Address> previousAddresses;

    public Person(String name,
                  String email,
                  String phoneNumber,
                  Gender gender) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(phoneNumber, person.phoneNumber) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNumber, gender);
    }
}
