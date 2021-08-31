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
A method is a block of code which only runs when invoked using `()`. We can use methods to reuse code that can be shared across the entire application.

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
An Enum is a type used specifically to represent sets of constants. For example, MALE or FEMALE.

To create an Enum is as following:
```java
public class Main {

    enum Gender {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {
        Gender male = Gender.MALE;
        Gender female = Gender.FEMALE;
    }

}
```


# Working with Dates
Java has a great API for working with dates. You should be aware of these classes:
- LocalDate
- LocalDateTime
- LocalTime 

```java
package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();
    }
}
```

Explore the methods available for each classes.

# Error Handling
When building applications things can go wrong and it is best practice to handle scenarios where our code does not behave as expected. Or simply deal with errors that we can anticipate.

I java we errors are called Exceptions and we can deal with them using the following constructs:
- The **try** statement allows you to define a block of code to be tested for errors while it is being executed.
- The **catch** statement allows you to define a block of code to be executed, if an error occurs in the try block.

```java
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```

## Checked Exceptions
Checked exceptions represent errors outside the control of the program. For example reading a file. You need to handle this error during compile time otherwise your code will not compile.

```java
File file = new File("file.txt");
try {
    FileInputStream stream = new FileInputStream(file);
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

## Unchecked Exceptions
If a program throws an unchecked exception, it reflects some error inside the program logic. For example, if we divide a number by 0, Java will throw ArithmeticException:

```java
System.out.println(10 / 0);
```


# Working with files

```java
package com.amigoscode;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // create file
        File file = new File("src/hello.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("hello");

        // once you are done writing to the file
        printWriter.flush();
        printWriter.close();

        // read example 
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}

```