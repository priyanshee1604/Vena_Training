# 🚨 Advanced Java Exception Handling - Coding Questions 🚨

---

## 1️⃣ Multi-level Exception Propagation 🔁

* Create three methods:

  * `readData()` → reads from a file, throws `IOException`.
  * `processData()` → calls `readData()`, catches `IOException`, then throws custom `DataProcessingException`.
  * `main()` → catches `DataProcessingException` and logs it.
* Simulate this flow and **explain how exceptions travel across layers**.

---

## 2️⃣ Custom Exception Hierarchy 🏦

* Define a base exception: `BankingException`.
* Create subclasses:

  * `InsufficientFundsException`
  * `InvalidAccountException`
* Implement a `transferFunds()` method that can throw either.
* Demonstrate:

  * Catching them **separately**.
  * Catching them **together** via the parent.

---

## 3️⃣ Exception-Safe Resource Handling (Multiple Resources) 📄✏️

* Write a program that opens:

  * `BufferedReader` (read from file)
  * `BufferedWriter` (write to file)
* Use **try-with-resources** to ensure safe closure even if exceptions occur midway.

---

## 4️⃣ Re-throwing Exceptions with Additional Context 🔄📝

* Write a method that:

  * Catches an exception.
  * Re-throws it as a **new custom exception** with a message.
  * Preserves the original stack trace using:

    ```java
    throw new CustomException("Custom message", e);
    ```

---

## 5️⃣ Partial Transaction Rollback on Failure 💸🔙

* Simulate a simple bank transfer system (in-memory).
* Ensure rollback if an exception occurs (e.g., invalid account).
* Use **try-catch** to maintain consistency: no partial transfer should succeed.

---

## 6️⃣ Custom Checked vs Unchecked Exceptions ⚖️

* Define:

  * A **checked exception** → `FileValidationException`.
  * An **unchecked exception** → `CriticalSystemException`.
* Write code showing **where & why** each type is used appropriately.

---

## 7️⃣ Handling Suppressed Exceptions (Multiple Close Operations) 🧹❗

* Create two custom resources that throw exceptions in `close()`.
* Use try-with-resources.
* Capture and display **suppressed exceptions** from the primary one.

---

## 8️⃣ Retry Mechanism (Programmatic Exception Handling Policy) 🔄🕒

* Write a method that reads from a **flaky service**.
* Retry up to **3 times**.
* If all attempts fail, throw a `ServiceUnavailableException`.

---

## 9️⃣ Chained Exceptions Across Layers 🏢➡️🛠️➡️🖥️

* Simulate a layered application:

  * Repository layer throws `SQLException`.
  * Service layer catches it and throws `ServiceLayerException`.
  * Controller layer catches it and logs it.
* Demonstrate **multi-layer exception wrapping**.

---

## 🔟 Misusing Exceptions as Control Flow (Anti-Pattern) ❌

* Write a program that incorrectly uses exceptions to:

  * **Break out of a loop** (e.g., catching exception inside loop for control).
* Then, refactor it to use a **proper loop condition** instead.

---

## 1️⃣1️⃣ Thread Exception Handling 🧵⚠️

* Create a multithreaded program:

  * Child thread throws a `RuntimeException`.
* Show how the main thread handles it using:

  ```java
  thread.setUncaughtExceptionHandler((t, e) -> {
      // handle exception
  });
  ```

---

## 1️⃣2️⃣ Global Exception Handler 🌍🛡️

* Write a Java app where all **uncaught exceptions** are globally logged.
* Use:

  ```java
  Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
      // global handler
  });
  ```
