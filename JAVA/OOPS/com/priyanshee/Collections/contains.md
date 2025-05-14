Great question! Let’s break this down clearly.

---

## ✅ **Which Collection Interfaces/Classes in Java Have `contains()` Method?**

### 1️⃣ **Collection Interface (Root level)**

* `contains(Object o)` is defined in **java.util.Collection** interface.
* **All subinterfaces and classes inherit this method.**

```java
boolean contains(Object o);
```

### 🔹 Example Subinterfaces that inherit `contains()`:

| Interface        | Inherits from Collection               | Has contains()? |
| ---------------- | -------------------------------------- | --------------- |
| **List**         | Yes                                    | Yes             |
| **Set**          | Yes                                    | Yes             |
| **Queue**        | Yes                                    | Yes             |
| **Deque**        | Yes                                    | Yes             |
| **NavigableSet** | Yes (via SortedSet → Set → Collection) | Yes             |

---

### 2️⃣ **Classes Implementing Collection (with contains() implemented)**

| Class             | Inherits contains() from                    | Uses contains() internally                   |
| ----------------- | ------------------------------------------- | -------------------------------------------- |
| **ArrayList**     | List → Collection                           | ✅ Linear search with equals()                |
| **LinkedList**    | List, Deque → Collection                    | ✅ Linear search with equals()                |
| **HashSet**       | Set → Collection                            | ✅ Hash-based lookup (uses hashCode + equals) |
| **LinkedHashSet** | Set → Collection                            | ✅ Hash-based lookup (maintains order)        |
| **TreeSet**       | NavigableSet → SortedSet → Set → Collection | ✅ Uses Comparator/Comparable for lookup      |
| **PriorityQueue** | Queue → Collection                          | ✅ Linear search with equals()                |
| **ArrayDeque**    | Deque → Queue → Collection                  | ✅ Linear search with equals()                |

---

### 3️⃣ **Map Interface is Different**

* **Map\<K, V>** is **not a Collection**.
* But it has similar methods:

    * `containsKey(Object key)`
    * `containsValue(Object value)`
* But it does **NOT inherit from Collection interface**.

---

## ✅ **Summary Answer**

* The `contains()` method is defined in **Collection interface**.
* All standard implementations of **List**, **Set**, **Queue**, **Deque**, **SortedSet**, **NavigableSet** inherit it.
* **Every concrete class (ArrayList, HashSet, TreeSet, LinkedList, etc.) has its own implementation logic.**

| Class/Interface                  | How does contains() work?                                                         |
| -------------------------------- | --------------------------------------------------------------------------------- |
| **ArrayList, LinkedList, Deque** | Linear search with `.equals()`                                                    |
| **HashSet, LinkedHashSet**       | Hash-based lookup with `hashCode()` + `equals()`                                  |
| **TreeSet**                      | Binary search tree lookup with `Comparator.compare()` or `Comparable.compareTo()` |

---

### 🔔 **Key Point**

> * `contains()` is available in **all Collection implementations**.
> * **The lookup mechanism depends on the data structure:**
    >
    >   * Hash-based → hashCode() + equals()
>   * Tree-based → Comparator / Comparable
>   * List/Array/Queue → equals() (linear search)

---

| Collection Class    | equals() Overridden?        | Where from?        | Behavior                                      |
| ------------------- | --------------------------- | ------------------ | --------------------------------------------- |
| **ArrayList**       | ✅ Yes                       | AbstractList       | Element-wise, **order-sensitive**             |
| **LinkedList**      | ✅ Yes                       | AbstractList       | Element-wise, **order-sensitive**             |
| **ArrayDeque**      | ✅ Uses AbstractCollection   | AbstractCollection | Element-wise, **order-sensitive** in practice |

