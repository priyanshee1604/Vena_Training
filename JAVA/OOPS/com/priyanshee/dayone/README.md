# Java OOP Concepts - Worksheet

## 1. Book Library (Class & Object)

* Create a `Book` class with fields: `title`, `author`, and `ISBN`.
* Include:

  * A constructor to initialize the fields.
  * A method to print book details.
* Create a `Library` class to:

  * Store a list of books.
  * Add a method to search for a book by title.

---

## 2. Vehicle Hierarchy (Inheritance)

* Design a `Vehicle` class with fields:

  * `speed`
  * `fuelCapacity`
* Extend it with two subclasses:

  * `Car`
  * `Truck`
* Add specific methods in each subclass:

  * Implement `getMileage()` with different calculation formulas.

---

## 3. Encapsulation with Validation

* Create a `BankAccount` class with private fields:

  * `accountHolder`
  * `balance`
  * `accountNumber`
* Use:

  * Getters and setters.
  * Validation logic to prevent setting a negative balance.

---

## 4. Drawing App (Polymorphism)

* Create a base `Shape` class with a method: `draw()`.
* Extend it with:

  * `Circle`
  * `Square`
  * `Triangle`
* Override the `draw()` method in each subclass.
* In the main method:

  * Store different shapes in an array.
  * Use a loop to call `draw()` on each shape object.

---

## 5. Employee Payroll System (Abstraction)

* Define an abstract class `Employee` with abstract methods:

  * `calculateSalary()`
  * `getDetails()`
* Extend it with:

  * `FullTimeEmployee`
  * `Freelancer`
* Each subclass should have its own salary calculation logic.

---

## 6. Student Registry (Static vs Instance)

* Create a `Student` class with:

  * A static counter to track the total number of students.
  * Instance fields like unique ID and name.
* After creating multiple objects, display the total number of students using the static counter.

---

## 7. Calculator Lockdown (final Keyword)

* Create a `BasicCalculator` class with a `final` method:

  * `add(int a, int b)`
* Extend it with `SmartCalculator`:

  * Attempt to override the `add()` method (should give an error).
  * Add a new method `subtract(int a, int b)` in the subclass.

---

## 8. Bank Account (this Keyword)

* Design a `BankAccount` class with fields:

  * `name`
  * `balance`
  * `type`
* Use the `this` keyword in:

  * Constructor to resolve variable shadowing.
  * Methods that update the balance.

---

## 9. Animal Sounds (super Keyword)

* Create a base class `Animal` with a method: `makeSound()`.
* Extend it with:

  * `Cat`
  * `Dog`
* Override the `makeSound()` method in each subclass:

  * First, call `super.makeSound()`.
  * Then, add animal-specific sound logic.

---

## 10. Inventory System (Object Arrays + Methods)

* Create a `Product` class with fields:

  * `id`
  * `name`
  * `price`
* In the `Store` class:

  * Create an array of products.
  * Add methods to:

    * Display all products.
    * Find the product with the highest price.
    * Search for a product by name.
