# Day 2

# Access Modifiers
Used to set the access level for classes, attributes, methods and constructors.

- **Default**
```java
String name = "Amigoscode"
```
- **Private**
Only accessible inside same class
```java
private String name = "Amigoscode"
```
- **Public**
The code is accessible for all classes
```java
public String name = "Amigoscode"
```
- **Protected**
Accessible in the same package and subclasses.
```java
protected String name = "Amigoscode"
```

# Methods
A method is a block of code which only runs when invoked using `()`. We can use methods to reuse code that can be shared accross the entire application.

Methods are composed of
- Access Modifier
- Return type
- Name
- Optional arguments 
- Method body
- Optional return value 

For example
```java
/* 
- Access Modifier = Public
- Return type = String
- Name = getName
- Optional arguments = () empty 
- Method body = 
- Optional return value = "Amigoscode"
*/
public String getName() {
    return "Amigoscode";
}
```

```java
/* 
- Access Modifier = Default
- Return type = String
- Name = getName
- Optional arguments = (int numberOne, int numberTwo) 
- Method body = {}
- Optional return value = "Amigoscode"
*/
String add(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
}
```

```java
/* 
- Access Modifier = Public
- Return type = void means return nothing
- Name = getName
- Optional arguments = () empty 
- Method body = Prints Amigoscode
- Optional return value = Nonne
*/
public void printBrand() {
    System.out.println("Amigoscode");
}
```

# Enums

# Working with Dates

# Error Handling

# Working with files

# Optionals