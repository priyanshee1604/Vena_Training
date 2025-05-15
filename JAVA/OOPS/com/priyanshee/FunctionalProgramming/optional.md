The `Optional` class in Java is part of the `java.util` package and was introduced in Java 8 to help handle situations where a value might be absent, reducing the risk of `NullPointerException` (NPE). It provides a more declarative way of dealing with `null` values, making code safer and more readable.

### **What is `Optional`?**

`Optional` is a container object that holds a value of type `T` (or is empty if no value is present). It represents the idea that a value may or may not be present, and offers a way to explicitly handle the absence of a value.

The main idea behind `Optional` is to help you avoid `null` references by providing methods that allow you to express the presence or absence of a value without explicitly checking for `null`.

### **How is `Optional` used?**

`Optional` is used to represent the possibility of a `null` value, but it does not actually replace `null` everywhere in the code. Instead, it provides a safer way to handle operations that may return a `null` value, by offering methods to interact with the potentially missing value.

### **Is `Optional` only used in functional programming?**

No, `Optional` is not limited to functional programming. It’s a tool that is particularly useful when you want to avoid `NullPointerExceptions` and handle missing or absent values in a more explicit way. While functional programming makes heavy use of such constructs, `Optional` is a general-purpose utility that can be applied in both object-oriented and functional programming paradigms.

It is particularly useful in scenarios where:

* A method might return a `null` value, but you want to express the absence of a value explicitly.
* You want to provide a more readable and safer alternative to checking for `null`.

### **Advantages of `Optional`:**

* **Null Safety:** Helps to avoid `NullPointerException` by requiring explicit handling of absent values.
* **Code Readability:** It makes the code clearer by signaling that the value might be missing, rather than using `null` as a magic value.
* **Declarative Programming:** Encourages a more functional style of programming by providing operations like `map()`, `flatMap()`, `filter()`, etc.

### **When NOT to use `Optional`:**

* **For Fields or Instance Variables:** Don’t use `Optional` for fields, as it could lead to more complexity without providing significant benefit.
* **In Collections:** Avoid using `Optional` in collections like `List<Optional<T>>` or `Map<K, Optional<V>>`. It's often better to use a collection with nullable values and handle `null` or absence of value directly.

### **Conclusion:**

The `Optional` class is a valuable addition to Java that helps to safely handle potentially missing values, improves readability, and reduces the chances of `NullPointerException`. It is not restricted to functional programming and can be beneficial in any scenario where you need to represent optional or missing values in a safe and expressive way.


| **Method**                                             | **Functionality**                                                                                  | **Input Value**                                                                  | **Return Value**                                                                       |
| ------------------------------------------------------ | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `empty()`                                              | Returns an empty `Optional`.                                                                       | None                                                                             | `Optional.empty()` (an empty `Optional` object)                                        |
| `of(T value)`                                          | Returns an `Optional` containing the given non-null value.But if you pass a null value, it will throw a NullPointerException                                         | A non-null value `value` of type `T`                                             | `Optional<T>` containing the given value                                               |
| `ofNullable(T value)`                                  | Returns an `Optional` containing the given value, or an empty `Optional` if the value is `null`.   | A value of type `T` (can be `null`)                                              | `Optional<T>` containing the value (or empty if `null`)                                |
| `isPresent()`                                          | Checks whether the `Optional` contains a non-null value.                                           | None                                                                             | `true` if value is present, `false` otherwise                                          |
| `isEmpty()`                                            | Checks whether the `Optional` is empty (does not contain a value).                                 | None                                                                             | `true` if `Optional` is empty, `false` otherwise                                       |
| `ifPresent(Consumer<T> action)`                        | Executes the provided action if the value is present.                                              | A `Consumer<T>` action                                                           | `void` (executes action if value is present, otherwise does nothing)                   |
| `get()`                                                | Returns the value if present, otherwise throws `NoSuchElementException`.                           | None                                                                             | The value of type `T` inside the `Optional` (throws `NoSuchElementException` if empty) |
| `orElse(T other)`                                      | Returns the value if present, otherwise returns the provided default value.                        | A default value `other` of type `T`                                              | The value inside `Optional`, or `other` if empty                                       |
| `orElseGet(Supplier<T> other)`                         | Returns the value if present, otherwise invokes the provided `Supplier` to obtain a default value. | A `Supplier<T>` (a lambda or method reference)                                   | The value inside `Optional`, or result of `Supplier` if empty                          |
| `orElseThrow()`                                        | Returns the value if present, otherwise throws a `NoSuchElementException`.                         | None                                                                             | The value inside `Optional`, or throws `NoSuchElementException` if empty               |
| `orElseThrow(Supplier<? extends X> exceptionSupplier)` | Returns the value if present, otherwise throws an exception provided by the `Supplier`.            | A `Supplier` that produces an exception                                          | The value inside `Optional`, or the exception from the `Supplier` if empty             |
| `map(Function<? super T, ? extends U> mapper)`         | Transforms the value inside the `Optional` using the provided `Function`, if present.              | A `Function<T, U>` that transforms the value of type `T` to `U`                  | An `Optional<U>` containing the transformed value, or empty if `Optional` is empty     |
| `flatMap(Function<? super T, Optional<U>> mapper)`     | Similar to `map()`, but the `Function` must return an `Optional` instead of a direct value.        | A `Function<T, Optional<U>>` that maps the value of type `T` to an `Optional<U>` | An `Optional<U>`, possibly empty, based on the result of the `Function`                |
| `filter(Predicate<? super T> predicate)`               | Returns an `Optional` containing the value if it matches the predicate, otherwise empty.           | A `Predicate<T>` to test the value                                               | An `Optional<T>`, either containing the value (if it matches the predicate) or empty   |
| `count()`                                              | Returns `1` if the `Optional` contains a value, otherwise returns `0`.                             | None                                                                             | `1` if the `Optional` contains a value, `0` otherwise                                  |
| `findFirst()`                                          | Returns the first value in the stream, or an empty `Optional` if the stream is empty.              | None                                                                             | `Optional<T>` containing the first element, or empty                                   |
| `findAny()`                                            | Returns any value from the `Optional`, or an empty `Optional` if the stream is empty.              | None                                                                             | `Optional<T>` containing any element, or empty                                         |
| `toArray()`                                            | Converts the `Optional` to an array (length 1 if present, empty array if empty).                   | None                                                                             | An array of type `T[]` containing the value (or an empty array)                        |
| `reduce(BinaryOperator<T> accumulator)`                | Performs a reduction on the value using the provided `BinaryOperator`, if present.                 | A `BinaryOperator<T>` that accumulates values                                    | The reduced value wrapped in an `Optional`, or empty if `Optional` is empty            |
| `anyMatch(Predicate<? super T> predicate)`             | Returns `true` if any element of the `Optional` matches the provided predicate.                    | A `Predicate<T>` to test the value                                               | `true` if the value matches the predicate, otherwise `false`                           |
| `allMatch(Predicate<? super T> predicate)`             | Returns `true` if all elements of the `Optional` match the provided predicate.                     | A `Predicate<T>` to test the value                                               | `true` if the value matches the predicate, otherwise `false`                           |
| `noneMatch(Predicate<? super T> predicate)`            | Returns `true` if no elements of the `Optional` match the provided predicate.                      | A `Predicate<T>` to test the value                                               | `true` if the value does not match the predicate, otherwise `false`                    |

---

### **Explanation of Methods:**

* **`map()`** and **`flatMap()`**: These are commonly used for transforming the value inside the `Optional`. The difference is that `flatMap()` is used when the transformation itself returns an `Optional`, while `map()` is used when it returns a direct value.
* **`filter()`**: Helps in filtering the value inside the `Optional`. If the value matches the condition in the `Predicate`, it returns the same `Optional`, otherwise, it returns an empty one.
* **`orElse()` and `orElseGet()`**: These methods are used to specify default values when the `Optional` is empty.
* **`reduce()`**: Performs a reduction on the value inside the `Optional` and is used to combine the value in some way.
* **`isPresent()`** and **`isEmpty()`**: These methods are used to check if a value is present or absent inside the `Optional`, respectively.
* **`get()`**: Retrieves the value inside the `Optional`, but throws an exception if the value is not present. This should be used cautiously.


### OPTIONAL VS STREAMS
Here's a detailed comparison of `Optional` vs. `Stream` in tabular format:

| **Aspect**                  | **`Optional`**                                                                           | **`Stream`**                                                                                 |
| --------------------------- | ---------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| **Purpose**                 | Represents a single value that may or may not be present.                                | Represents a sequence of values (zero or more).                                              |
| **Type of Data**            | Single value (zero or one element).                                                      | Sequence of values (zero or many elements).                                                  |
| **Use Case**                | Used to handle the presence or absence of a single value (i.e., non-null).               | Used for processing multiple elements (e.g., from collections or arrays).                    |
| **Size**                    | Can only have 0 or 1 element (either empty or containing a value).                       | Can have 0 or many elements, can represent infinite sequences (e.g., generated streams).     |
| **Creation**                | Created via `Optional.of()`, `Optional.empty()`, or `Optional.ofNullable()`.             | Created via `Stream.of()`, `Arrays.stream()`, `Stream.generate()`, etc.                      |
| **Null Handling**           | Explicitly handles the possibility of `null` values.                                     | Does not deal with nulls directly, works with empty or non-empty collections.                |
| **Operations**              | Supports operations like `map()`, `flatMap()`, `filter()`, `ifPresent()`.                | Supports operations like `map()`, `flatMap()`, `filter()`, `reduce()`, `collect()`.          |
| **Terminal Operations**     | Supports terminal operations like `get()`, `orElse()`, `ifPresent()`.                    | Supports terminal operations like `forEach()`, `collect()`, `reduce()`, `count()`.           |
| **Lazy Evaluation**         | No lazy evaluation. Operations are evaluated immediately once the value is accessed.     | Lazy evaluation. Operations are performed only when a terminal operation is called.          |
| **Null Safety**             | Used to avoid `NullPointerException` by explicitly checking for the presence of a value. | Does not deal directly with nulls but can work with empty sequences.                         |
| **Chaining Operations**     | Supports chaining for operations on the contained value (if present).                    | Supports chaining of operations in a stream pipeline.                                        |
| **Empty State**             | `Optional.empty()` represents the absence of a value.                                    | An empty stream (`Stream.empty()`) represents no elements to process.                        |
| **Functional Style**        | Supports functional-style operations to handle the potential absence of a value.         | Supports functional-style operations for working with collections of data.                   |
| **Example**                 | `Optional<String> name = Optional.of("Alice"); name.map(String::toUpperCase);`           | `Stream<String> stream = Stream.of("Apple", "Banana"); stream.forEach(System.out::println);` |
| **Performance**             | Lightweight because it only holds one value.                                             | Optimized for large-scale data processing with lazy evaluation.                              |
| **Parallel Processing**     | Not intended for parallel processing as it handles only one value.                       | Can be processed in parallel using `parallelStream()` for large datasets.                    |
| **Memory Efficiency**       | Very memory efficient as it only holds a single value.                                   | Can use more memory as it potentially holds large datasets (like collections).               |

The core difference lies in how they represent data: `Optional` works with a single value, while `Stream` works with sequences of values, often with an emphasis on large-scale or complex data processing.
