
```java
students.stream()
    .sorted(Comparator.comparing(Student::getBranch)
    .thenComparing(Comparator.comparing(Student::getGrade).reversed()))
    .forEach(System.out::println);
```

Let’s explain **concept by concept**, including **interfaces, default methods, return types**, and **what happens in stream pipeline**.

---

## 🟢 1. `students.stream()`

* `students` → a **Collection of Student objects** (`List<Student>`).
* `.stream()` → returns a \*\*Stream<Student>\`.

    * Stream allows functional-style operations on collections (map, filter, sort, etc.).
* **Type:** `Stream<Student>`

---

## 🟢 2. `.sorted(Comparator.comparing(...))`

* The `sorted()` method sorts elements of the stream.
* Signature:

  ```java
  Stream<T> sorted(Comparator<? super T> comparator);
  ```
* Needs a `Comparator<Student>` to define the sort order.

---

## 🟢 3. `Comparator.comparing(Student::getBranch)`

### ❓ But wait! `Comparator` is an **interface**.

* `Comparator` is a **functional interface** with method:

  ```java
  int compare(T o1, T o2);
  ```
* Since Java 8, interfaces can have:

    * **static methods** ✅
    * **default methods** ✅
* `Comparator.comparing` is a **static method**:

  ```java
  static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor)
  ```

### ✅ What it does:

* Takes a **Function\<T, U>**:

    * Here: `Student::getBranch` (method reference).
    * Equivalent to: `(Student s) -> s.getBranch()`.
* Returns a **Comparator<Student>** that compares by `getBranch()`.

### ✅ Returns:

* A **Comparator<Student>**.

---

## 🟢 4. `.thenComparing(Comparator.comparing(Student::getGrade).reversed())`

* `thenComparing` is a **default method** in `Comparator` interface:

  ```java
  default Comparator<T> thenComparing(Comparator<? super T> other)
  ```
* This allows **chaining** comparators → primary + secondary sorting.

### ✅ Inside `thenComparing`:

* `Comparator.comparing(Student::getGrade)`:

    * Uses `getGrade()` to compare students.
    * Returns a **Comparator<Student>** for grade.

### ✅ `.reversed()`

* `reversed()` is a **default method** in `Comparator` interface.
* Returns a new **Comparator<Student>** with reverse order.

### ✅ Returns:

* `.reversed()` returns **Comparator<Student>** (grade in descending order).

### ✅ Full result:

* `thenComparing(...)` returns a **new Comparator<Student>**.
* Combines:

    * Primary sort: `getBranch()`.
    * Secondary sort: `getGrade()` (descending).

---

## 🟢 5. `.forEach(System.out::println)`

* Terminal operation.
* Iterates over each sorted Student and prints it.
* Uses method reference: `System.out::println` equivalent to `(student) -> System.out.println(student)`.

---

## 🔎 **Summary of Return Types Flow**

| Expression                                 | Return Type           | Purpose                                      |
| ------------------------------------------ | --------------------- | -------------------------------------------- |
| `students.stream()`                        | `Stream<Student>`     | Stream of Student objects                    |
| `Comparator.comparing(Student::getBranch)` | `Comparator<Student>` | Comparator by branch                         |
| `Comparator.comparing(Student::getGrade)`  | `Comparator<Student>` | Comparator by grade                          |
| `.reversed()`                              | `Comparator<Student>` | Reversed grade comparator                    |
| `.thenComparing(...)`                      | `Comparator<Student>` | Combined comparator (branch asc, grade desc) |
| `.sorted(...)`                             | `Stream<Student>`     | Sorted Stream of Student                     |
| `.forEach(System.out::println)`            | `void`                | Terminal operation                           |

---

## 🟡 **Important Concept Recap**

| Concept                                          | Explanation                                                                            |
| ------------------------------------------------ | -------------------------------------------------------------------------------------- |
| **Comparator is interface**                      | But `comparing` is a **static method**, callable via interface name.                   |
| **thenComparing & reversed are default methods** | Called on instances of `Comparator` (chained via return values).                       |
| **Method references (`Student::getBranch`)**     | Used to pass getter methods as functional interface implementations.                   |
| **Stream sorted needs Comparator**               | You build Comparators with static and default methods fluently.                        |
| **Stream pipeline**                              | Returns new streams at each step, processed lazily, executed at terminal op (forEach). |

---

### 🧠 **Final Thought**

* You **build Comparators** using static & default methods.
* You **chain Comparators** with fluent API (`thenComparing`, `reversed`).
* Stream API uses this Comparator for sorting.
* Functional programming + OOP blending in Java 8+.

---

Exactly! You got it right. Let me explain in detail why this works.

---

## ✅ **Answer to Your Question**

> **"Is the Comparator returned by comparing() an instance of Comparator? Thus, we can call default methods on it, otherwise we cannot call default methods directly on Comparator."**

### 🔹 Yes, correct.

* `Comparator.comparing(Student::getBranch)` returns an **instance of Comparator<Student>**.
* Even though `Comparator` is an **interface**, this is allowed because:

    * `comparing()` is a **static method** of `Comparator` interface.
    * Inside `comparing()`, an **anonymous class or lambda** is created that **implements Comparator<Student>**.

---

## ✅ **Why Default Methods Work Here?**

* **Default methods** are meant to be called on **instances of an interface**.
* The result of `Comparator.comparing(...)` is an actual **object** that **implements Comparator<Student>**.
* Once you have that instance, you can call **default methods** on it, like:

    * `.thenComparing()`
    * `.reversed()`
    * `.nullsFirst()`
    * etc.

---

## ✅ **But Why Can't We Do This?**

```java
Comparator.reversed();  // ❌ Compilation error!
```

* Because `reversed()` is a **default method**, not a static method.
* You can only call it on an **instance of Comparator**, not on the interface type.

---

## ✅ **But This Works:**

```java
Comparator<Student> comp = Comparator.comparing(Student::getBranch);
Comparator<Student> reversedComp = comp.reversed();
```

* Because `comp` is now an **instance of Comparator<Student>**.
* Now `.reversed()` can be called because `comp` is an object (even if it's created from a lambda or method reference).

---

## ✅ **Summary**

| What                                                        | Why                                                                |
| ----------------------------------------------------------- | ------------------------------------------------------------------ |
| `Comparator` is an interface                                | Yes, but can have static & default methods                         |
| `Comparator.comparing(...)`                                 | Static method that **returns an instance of Comparator<T>**        |
| `reversed()`, `thenComparing()`                             | Default methods → can be called on **instances only**              |
| Cannot call default method on `Comparator` interface itself | Needs instance returned from `comparing()`, `naturalOrder()`, etc. |

---

### ✅ Example Flow:

```java
Comparator<Student> c1 = Comparator.comparing(Student::getBranch);  // instance created
Comparator<Student> c2 = c1.reversed();  // default method called on instance
```

---

### ✅ Visualization:

```java
Comparator  (Interface)
   |
   |-- static comparing(Function)
   |       |
   |       |-- returns an instance of Comparator<T>
   |                       |
   |                       |-- instance has default methods (reversed, thenComparing, etc.)
```