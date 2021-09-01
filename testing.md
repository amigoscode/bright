# Junit5

JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

The JUnit Platform serves as a foundation for launching testing frameworks on the JVM. It also defines the TestEngine API for developing a testing framework that runs on the platform. Furthermore, the platform provides a Console Launcher to launch the platform from the command line and a JUnit 4 based Runner for running any TestEngine on the platform in a JUnit 4 based environment. First-class support for the JUnit Platform also exists in popular IDEs (see IntelliJ IDEA, Eclipse, NetBeans, and Visual Studio Code) and build tools (see Gradle, Maven, and Ant).

JUnit Jupiter is the combination of the new programming model and extension model for writing tests and extensions in JUnit 5. The Jupiter sub-project provides a TestEngine for running Jupiter based tests on the platform.

JUnit Vintage provides a TestEngine for running JUnit 3 and JUnit 4 based tests on the platform.

To get started we need the following maven dependencies to get started with Junit5

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.7.2</version>
    <scope>test</scope>
</dependency>
```

Full pom.xml


```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>FooTest</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>16</maven.compiler.source>
        <maven.compiler.target>16</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

# Create your first test

All tests reside under `src/test/java/package` and the name must be the same as the class you are testing but with `Test` at the end. i.e Main > MainTest

![Screenshot 2021-08-31 at 19 21 04](https://user-images.githubusercontent.com/40702606/131556052-62ee741e-3053-4b8e-a1f8-4d49eb40a5f7.png)


So inside MainTest.java or what empty class name you have write the following

```java
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void myFirstTest() {

    }
}
```

Click on Run and you should see an output as follows

![Screenshot 2021-08-31 at 19 25 24](https://user-images.githubusercontent.com/40702606/131556226-2beb2626-f7cb-4bad-bec3-20c32fa05302.png)

![Alt Text](https://media.giphy.com/media/IwAZ6dvvvaTtdI8SD5/giphy.gif)

Hold on don't get too excited. The test does nothing at the moment.

# Assertions
```java
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
```
We could use assertions from Junit however is not as nice as AssertJ: https://assertj.github.io/doc/#assertj-overview

To install AssertJ we need the following dependency

```xml
<dependency>
  <groupId>org.assertj</groupId>
  <artifactId>assertj-core</artifactId>
  <!-- use 2.9.1 for Java 7 projects -->
  <version>3.20.2</version>
  <scope>test</scope>
</dependency>
```

```java
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MainTest {

    @Test
    void myFirstTest() {
        assertThat("actual").isEqualTo("expected");
    }
}
```

Refer to https://assertj.github.io/doc/ for full api documentation