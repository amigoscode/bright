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


# Static
In the Java programming, the keyword static indicates that the particular member belongs to a class, rather than to an instance of that class.

```java
public class Person {
    private static int count = 0;
    private String name;
}
```

To access a static field we can just refer to the class name followed by a dot then the static field.

```java
System.out.println(Person.count)
```

There is no need to create an instance of Person to access the field count inside Person.

# Inheritance
Inheritance is the process of inheriting attributes and methods from another class using the **extends** keywords.

**There are two concepts:**
- Subclass (child) - the class that inherits from another class
- Superclass (parent) - the class being inherited from

Creating class Animal and instantiating an object is to absract. Which animal? is it a dog or a cat?

Lets create a superclass called Animal and 2 subclass. One for Dog and another for Cat. Both dog and cat are animals.

```java
package com.amigoscode.inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sleep() {
        System.out.println(name + " sleep...");
    }

    public void eat() {
        System.out.println(name + " eating...");
    }
}
```

```java
package com.amigoscode.inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(this.getName() + " is meowing...");
    }

}
```

```java
package com.amigoscode.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println(this.getName() + "is barking...");
    }

}
```

```java
package com.amigoscode.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("rosie", 2);
        System.out.println(cat.getClass().getSuperclass());
        System.out.println(cat.getClass().getSimpleName());
        sleepAndEat(cat);

        Dog dog = new Dog("bobby", 10);
        System.out.println(dog.getClass().getSuperclass());
        System.out.println(dog.getClass().getSimpleName());
        sleepAndEat(dog);
    }

    public static void sleepAndEat(Animal animal) {
        animal.eat();
        animal.sleep();
    }

}
```

# Abstract Keyword
As mentioned above if we create an object of type Animal it does not really makes sense. To prevent anyone from creating objects using the class Animal we can add the keyword **abstract** as follows:

```java
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sleep() {
        System.out.println(name + " sleep...");
    }

    public void eat() {
        System.out.println(name + " eating...");
    }
}
```

If you try the following code it will not compile.
```java
Animal animal = new Animal("bobby", 2);
```

However we can animals like this:
```java
Animal cat = new Cat("rosie", 2);
Animal dog = new Dog("bobby", 10);
```

This works because both Cat and Dog extend Animal.

# Interfaces
```java
package com.amigoscode.interfaces;

public interface Vehicle {
    void speedUp(int speed);
    void applyBreak(int speed);
}
```

```java
package com.amigoscode.interfaces;

public class Bicycle implements Vehicle {

    private int speed;

    public Bicycle(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(int speed) {
        System.out.println("Pedaling");
        this.speed += speed;

    }

    @Override
    public void applyBreak(int amount) {
        System.out.println("Stop pedaling");
        System.out.println("Apply hand break");
        this.speed -= amount;
    }
}
```

```java
package com.amigoscode.interfaces;

public class Car implements Vehicle {

    private int speed;
    private int gear;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(int speed) {
        this.gear++;
        System.out.println("changing gears to " + this.gear);
        System.out.println("accelerate");
        this.speed += speed;
    }

    @Override
    public void applyBreak(int amount) {
        System.out.println("press breaks with foot");
        this.speed -= amount;
    }
}
```

```java
package com.amigoscode.interfaces;

public class Person {
    private String name;
    private Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
```

```java
package com.amigoscode.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(0);
        Bicycle bicycle = new Bicycle(0);
        Person person = new Person("Mariam", bicycle);
        // Or -> Person person = new Person("Mariam", car);
    }
}
```