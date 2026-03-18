# Builder Pattern (Creational Design Pattern)

## Definition

The **Builder Pattern** is a creational design pattern that:

> Extracts object creation logic from a class and moves it into a separate **Builder** object.

---

## Purpose

* Avoid complex constructors (especially with many parameters)
* Build objects step-by-step
* Improve readability and maintainability
* Support optional and flexible object creation

---

## Core Idea

Instead of creating an object like this:

```java
new Car(engine, wheels, seats, color, gps, ...)
```

We use:

```java
Car car = Car.builder()
    .engine(engine)
    .wheels(4)
    .color("red")
    .build();
```

---

## Components of Builder Pattern

### 1. Product (e.g., `Car`)

* The main object being created
* Contains fields and a constructor
* Constructor is **not public**

---

### 2. Builder

* Separate class responsible for constructing the object
* Contains:

  * Same fields as the product
  * Setter-like methods (without `set` prefix)
  * A `build()` method

#### Example

```java
public class Car {
    private final String engine;
    private final int wheels;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
    }

    public static class Builder {
        private String engine;
        private int wheels;

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
```

---

### 3. Build Method

* Creates and returns the final object
* Calls the **private constructor** of the product

```java
public Car build() {
    return new Car(this);
}
```

---

## Why Constructor is NOT Public

### Reason

To **force usage of Builder** and prevent misuse of large constructors.

### Rules

* If Builder is an **inner class** → constructor should be `private`
* If Builder is **external** → constructor can be `package-private`

### Benefit

* Prevents incorrect object creation
* Ensures controlled, readable construction

---

## Director (Optional Component)

### What is Director?

A class that defines **how to build an object step-by-step**.

### Purpose

* Encapsulates construction logic
* Reuses common configurations

---

### Example

```java
public class CarDirector {

    public void buildSportsCar(Builder builder) {
        builder.engine("V8")
               .wheels(4);
    }
}
```

---

### Usage

```java
Builder builder = new Car.Builder();
CarDirector director = new CarDirector();

director.buildSportsCar(builder);
Car car = builder.build();
```

---

### Key Points

* Director is **optional**
* Helps reuse predefined configurations
* Hides construction logic from client

---

## Multiple Builders with Director

### Step 1: Create a common Builder interface

```java
public interface Builder {
    Builder engine(String engine);
    Builder wheels(int wheels);
}
```

### Step 2: Implement multiple builders

```java
public class CarBuilder implements Builder { ... }
public class TruckBuilder implements Builder { ... }
```

### Step 3: Use same Director

```java
director.buildSportsCar(carBuilder);
director.buildSportsCar(truckBuilder);
```

---

## Benefits

* Improves readability
* Avoids telescoping constructors
* Handles optional fields easily
* Enables immutable objects
* Supports step-by-step construction
* Safer object creation

---

## Problems It Solves

| Problem                         | Solution                      |
| ------------------------------- | ----------------------------- |
| Too many constructor parameters | Builder simplifies creation   |
| Confusing parameter order       | Named methods improve clarity |
| Optional fields                 | Easily skipped                |
| Immutable objects               | Built safely before creation  |
| Object creation complexity      | Encapsulated in builder       |

---

## Summary

* Builder separates **construction logic** from the object
* Uses **method chaining** for readability
* `build()` creates the final object
* Constructor is hidden to enforce builder usage
* Director can standardize object creation (optional)

---

## One-Line Summary

> Builder Pattern lets you construct complex objects step-by-step in a readable, flexible, and safe way.
