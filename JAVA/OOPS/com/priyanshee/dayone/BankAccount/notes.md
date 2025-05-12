## ✅ 1. **Protected Access Modifier — Who can access it?**

* **`protected` members** in Java:

  | Can be accessed by:                   | Explanation                             |
    | ------------------------------------- | --------------------------------------- |
  | ✅ Subclasses (even in other packages) | Through inheritance                     |
  | ✅ Any class in the **same package**   | Without inheritance, like normal access |

🔹 So, in your case:

* `setBalance(double balance)` is `protected` in `BankAccount`.
* It can be accessed:

    * From `SavingAccount`, `CurrentAccount` (subclasses).
    * Also by **other classes in same package** (even if they don’t extend BankAccount).

→ ✅ Yes, it can be accessed in the same package (package-level access is granted).

---

## ✅ 2. **Is `displayAccountType()` called Override or Implement?**

### 🔹 Difference:

* **Implementation** → When you define a method from an **interface**.
* **Overriding** → When you provide a new definition for a method inherited from a **parent class** (or abstract class).

### 🔹 In your case:

* `displayAccountType()` is **declared abstract** in `BankAccount`.
* Subclasses (`SavingAccount`, `CurrentAccount`) **override it**.

📢 **Important**:

* Even though abstract classes don't "implement" methods, they **declare them** to force overriding.
* When subclasses provide their version, it's called **method overriding**, **not implementing**.

✅ Correct term → **Overriding** abstract method.

---

## ✅ 3. **How does displayAccountType() show Polymorphism?**

### ✅ Concept of Polymorphism:

* **Polymorphism** = "One interface, multiple forms."
* Parent reference can point to objects of child classes.
* Method calls are resolved at **runtime** (dynamic binding).

### ✅ Example from your code:

```java
BankAccount account = new SavingAccount("1234", 10000);
account.displayAccountType();  // Executes SavingAccount's method

account = new CurrentAccount("34224", 20000, 1000);
account.displayAccountType();  // Executes CurrentAccount's method
```

### 🔹 Why is this polymorphism?

* Reference type → `BankAccount`.
* Actual object → could be `SavingAccount` or `CurrentAccount`.
* **At runtime**, JVM decides which `displayAccountType()` to execute.
* This is called **runtime polymorphism** (or dynamic method dispatch).

✅ So yes, `displayAccountType()` demonstrates **polymorphism via method overriding**.

---

## ✅ 4. **Constructor Chaining — Detailed Explanation**

### ✅ What is Constructor Chaining?

* When one constructor calls another constructor **in the same class** or **parent class**.
* Helps to reuse initialization logic and maintain DRY principle.

### ✅ Two types:

1. **Within same class** → `this()`
2. **From parent class** → `super()`

### ✅ Your Example:

```java
public SavingAccount(String accountNumber, double balance) {
    super(accountNumber, balance);  // Calling BankAccount constructor
}
```

* When you create a `SavingAccount` object:

    * First, the **SavingAccount constructor** is called.
    * It chains to the **BankAccount constructor** using `super(accountNumber, balance);`.
    * This initializes common attributes (like accountNumber, balance).

✅ This is **constructor chaining to parent class**.

---

## ✅ 5. **Why getTransactionLimit() is not Polymorphism — What is this called?**

* This is called **Compile-time type checking**.
* **Compile-time polymorphism** involves overloading, but here it’s about:

    * The compiler checks the **reference type** to resolve methods.
    * Methods present in the **parent reference type** are allowed.
    * Child-specific methods are not visible through the parent reference.

### ✅ In your example:

```java
BankAccount currentAccount = new CurrentAccount("34224", 20000, 1000);
currentAccount.getTransactionLimit();  // ❌ Compile-time error
```

* The **reference type** is `BankAccount`.
* `BankAccount` does not declare `getTransactionLimit()`.
* Compiler does not care about the actual object type (`CurrentAccount`).
* Hence → **Compile-time error: cannot find symbol**.

✅ This is **compile-time type safety / compile-time method resolution**.

---

## ✅ 6. **Using Parent Reference — But What About getTransactionLimit()?**

You asked:

> "You used child reference → Should use parent reference in current. If I do so, how will getTransactionLimit() be called?"

✅ Answer:

* **Polymorphism applies only to overridden methods**, not new methods.
* `getTransactionLimit()` is **specific to CurrentAccount** → hence not polymorphic.
* To access child-specific methods, you need to:

    * **Downcast the parent reference to child class**.

### ✅ Example:

```java
BankAccount currentAccount = new CurrentAccount("34224", 20000, 1000);

// Polymorphism: Overridden method works
currentAccount.displayAccountType();

// To access CurrentAccount specific method:
if (currentAccount instanceof CurrentAccount) {
    double limit = ((CurrentAccount) currentAccount).getTransactionLimit();
    System.out.println("Transaction Limit: " + limit);
}
```

* ✅ This way, you follow polymorphism principles and still access child-specific methods safely.

---

## ✅ Final Quick Summary:

| Concept                       | Correctness            | Your Understanding                                        |
| ----------------------------- | ---------------------- | --------------------------------------------------------- |
| `protected` access            | ✅                      | Accessible in same package & subclasses                   |
| `displayAccountType` usage    | ✅                      | Correct overriding & polymorphism                         |
| Constructor Chaining          | ✅                      | You used `super()`, correct chaining                      |
| Overriding vs Implementing    | ✅                      | Overriding abstract method is right term                  |
| getTransactionLimit issue     | ✅                      | Compile-time type safety, use downcasting to access       |
| Polymorphism (CurrentAccount) | Needs parent reference | Use BankAccount reference + downcast for specific methods |
