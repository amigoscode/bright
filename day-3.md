# Classes and Objects

# Class
A class is a blueprint to represent anything in the real world. Classes are made of 2 important concepts. Properties/Characteristics and behaviors.  

# Object
Object is the real thing. For example from a Person class we can create multiple people.

# Example

```java
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
```

Most the code above can be generate using IntelliJ or you favorite IDE.

# Properties
```java
private String name;
private String email;
private String phoneNumber;
private Gender gender;
private Address address;
private List<Address> previousAddresses;
```
# Constructor
Used to set the initial values for any given object
```java
public Person(
    String name,
    String email,
    String phoneNumber,
    Gender gender) {
this.name = name;
this.email = email;
this.phoneNumber = phoneNumber;
this.gender = gender;
}

```
# Getters
Used to set a particular property value
```java
public String getName() {
    return name;
}
```
# Setters
```java
public void setName(String name) {
    this.name = name;
}
```
# ToString
Used to print the string representation of an Object
```java
 @Override
public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", gender=" + gender +
            '}';
}
```
# Equals and Hashcode
The java equals hashcode are methods used to compare two Person objects

```java
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
```

# Examples
https://github.com/amigoscode/bright/tree/main/examples