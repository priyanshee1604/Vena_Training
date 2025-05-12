No, **`AutoCloseable` is *not* a functional interface**.

---

### ✅ Explanation:

A **functional interface** in Java is an interface that has **exactly one abstract method**, so it can be used with **lambda expressions** or **method references**.

---

### 🔍 Let's examine `AutoCloseable`:

```java
@FunctionalInterface  // ❌ Not present here!
public interface AutoCloseable {
    void close() throws Exception;
}
```

It **does** have only **one abstract method** (`close()`), but:

* It is **not annotated** with `@FunctionalInterface` (though that’s optional).
* More importantly: its `close()` method **throws a checked exception** (`Exception`), which makes it **inconvenient or even impossible** to use in lambdas without handling that checked exception — so it's **not intended for functional use**.

---

### ✅ So even though:

* It technically has one abstract method,
* It **cannot be reliably used** in a functional context (like streams or lambdas),
* And it's **not marked or treated** as a functional interface.


**Same goes for Closeable Interface.**