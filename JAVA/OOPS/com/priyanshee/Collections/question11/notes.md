Answer 1.
❌ What happens if you don't override equals() and hashCode()?
Let’s say you add this:

tracker.addAsset("IT", new Asset("A001", "Laptop"));
tracker.addAsset("IT", new Asset("A001", "Laptop")); // same id and name
Without overridden equals() and hashCode():
Both objects are different instances (different memory locations).

Java compares them using default Object.equals(), which checks:

this == other  // reference equality, not content equality
So HashSet thinks they are different and adds both.

Result:

Set<Asset> = [Asset{id='A001', name='Laptop'}, Asset{id='A001', name='Laptop'}]
❌ Duplicate appears.

✅ What happens with overridden equals() and hashCode():
If you override them like this:

@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Asset asset = (Asset) o;
    return Objects.equals(id, asset.id);
}

@Override
public int hashCode() {
    return Objects.hash(id);
}
Then both objects (even if they are different instances) will be considered equal if their id is the same.

So the second call to add() will be ignored by the Set.

✅ No duplicate is stored.

--------------------------------

when to overrider hashcode() and equals() and when not to:

Exactly — you're spot on. Let's break this down clearly:

---

## ✅ You do **not** need to override `equals()` and `hashCode()` when:

You are using **built-in types** (like `String`, `Integer`, `Double`, etc.) in your collections:

```java
Set<String> strings = new HashSet<>();
Set<Integer> ids = new HashSet<>();
```

That’s because **Java’s standard types already override** `equals()` and `hashCode()` properly.

---

## 🔁 You **must override** `equals()` and `hashCode()` when:

You are using **your own custom class** (like `Asset`, `Player`, `Employee`, etc.) as:

### 1. **Element in a `Set`**

```java
Set<Asset> assets = new HashSet<>();
assets.add(new Asset("A001", "Printer"));
assets.contains(new Asset("A001", "Printer")); // needs equals() + hashCode()
```

### 2. **Key in a `Map`**

```java
Map<Asset, String> assetOwners = new HashMap<>();
assetOwners.put(new Asset("A001", "Printer"), "IT");

String owner = assetOwners.get(new Asset("A001", "Printer")); // needs equals() + hashCode()
```

### 3. **When comparing objects manually using `contains()`, `remove()`, etc.**

```java
List<Asset> assets = new ArrayList<>();
assets.add(new Asset("A001", "Printer"));

assets.contains(new Asset("A001", "Printer")); // uses equals()
```

If you don’t override `equals()` and `hashCode()`:

* Each object is considered **unique** unless it's the exact same instance (==).

---

## 🧠 Rule of Thumb

| Use Case                             | Need to override `equals()` & `hashCode()`                                    |
| ------------------------------------ | ----------------------------------------------------------------------------- |
| Storing **custom objects in Set**    | ✅ Yes                                                                         |
| Using **custom objects as Map keys** | ✅ Yes                                                                         |
| Storing **String / Integer**         | ❌ No                                                                          |
| Only using **Lists / arrays**        | ❌ Not required for equality checks unless you call `contains()` or `remove()` |

---
