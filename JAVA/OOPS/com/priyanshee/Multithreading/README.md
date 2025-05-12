# 📝 Java Multithreading Assignments

### Instructions:

* **Language**: Java
* **Submit**: Source code + README (with instructions to run)
* **Bonus points**: For tests (JUnit/TestNG)

---

## 💻 Assignment 1: Multi-threaded Logging System

### **Background**:

You're building a high-throughput logging system for a large-scale application. Logs are generated from various parts of the system and should be stored in the order received, without blocking the producers.

### **Requirements**:

#### **Part 1: Basic Logging System**

* Implement a class `Logger` with the following features:

  * Method: `void log(String message)`
  * Accepts log messages from multiple threads concurrently.
  * Stores the messages in the order they were received.
  * Uses a separate thread to flush logs every 5 seconds to the console (simulate disk).

#### **Part 2: Graceful Shutdown**

* Provide a method `void shutdown()` that:

  * Ensures all pending logs are flushed.
  * Terminates the logging thread cleanly.

#### **Part 3: Stress Simulation**

* Simulate 100 threads each logging 100 messages.
* Ensure that the messages do not get lost or printed out of order.

---

### **Bonus Requirements**:

* Support log levels (`INFO`, `WARN`, `ERROR`).
* Add timestamps to log entries.
* Provide optional file-based flushing instead of console (via configuration).

---

## 💳 Assignment 2: Bank Account Synchronization

### **Background**:

Simulate a multi-threaded banking system that supports concurrent deposits and withdrawals from shared accounts.

### **Requirements**:

* Implement a `BankAccount` class with:

  * Methods: `deposit(double amount)`, `withdraw(double amount)`
  * Thread-safe balance modification.
* Create multiple threads representing users performing deposits and withdrawals.
* Ensure no overdrawing and correct final balance.

---

### **Bonus Requirements**:

* Add transaction logging.
* Add per-account lock to prevent locking the entire bank.

---

## 🔢 Assignment 3: Odd-Even Printer

### **Background**:

Create a coordinated printing system where two threads print odd and even numbers up to 100 in sequence.

### **Requirements**:

* Thread A prints odd numbers (1, 3, 5...).
* Thread B prints even numbers (2, 4, 6...).
* Output must be in order: `1 2 3 4 5 ... 100`.
* Use `wait()` and `notify()` for coordination.

---

## 🖼️ Assignment 4: Thread Pool Image Processor

### **Background**:

Simulate a parallel image processing pipeline using Java’s `ExecutorService`.

### **Requirements**:

* Given 50 image IDs (1–50), simulate processing (sleep 100ms).
* Return a message `Image X processed` for each.
* Collect and print results in order using `Callable` + `Future`.

---

### **Bonus Requirements**:

* Use a fixed thread pool of size 5.
* Measure total execution time.

---

## 🏅 Evaluation Rubric (applies to all assignments):

| **Category**                | **Points** | **Criteria**                                         |
| --------------------------- | ---------- | ---------------------------------------------------- |
| **Correctness**             | 30         | Meets all functional requirements                    |
| **Thread-Safety**           | 20         | Proper use of synchronization, no race conditions    |
| **Design & Architecture**   | 20         | Modularity, clean abstraction, reusable code         |
| **Performance/Scalability** | 10         | Handles high-volume input without blocking or errors |
| **Code Quality**            | 10         | Naming, structure, comments, readability             |
| **Tests (Bonus)**           | 10         | Unit tests provided, stress test scenarios           |

---

## 📄 Submission:

* **Source code** (Java 8+ compatible)
* **README** with:

  * Assumptions
  * Build and run instructions
  * Sample output
