## 🧠 Core idea

> **JaCoCo instruments your compiled `.class` files and tracks which instructions are executed during test runs.**

> JaCoCo measures coverage on compiled classes, not on .java files.

---

## ⚙️ How it works step-by-step

### 1. Instrumentation (before tests run)

When you run tests (via Maven/Gradle), JaCoCo:

* Injects probes into compiled bytecode (`.class` files)
* Each probe = a checkpoint in the code (method entry, branches, etc.)

---

### 2. Test execution

As your unit tests run:

* Every time execution hits a probe → it is marked as “executed”

Example:

```java id="7qhj2v"
public void deleteTemporaryFiles() {
}
```

Even this empty method:

* Has at least **one probe (method entry)**
* If not called → probe is never hit → **0% coverage**
* If called → probe hit → **100% for that method**

---

### 3. Execution data collection

JaCoCo stores execution data in a file:

```
jacoco.exec
```

This file contains:

* Which classes were loaded
* Which probes were hit

---

### 4. Report generation

JaCoCo combines:

* Execution data (`jacoco.exec`)
* Compiled classes (`.class`)
* Source code (`.java`)

Then maps execution → source lines

---

## 📊 What coverage metrics actually mean

JaCoCo reports several types:

### 1. **Instruction coverage (C0)** ← most fundamental

> % of bytecode instructions executed

---

### 2. **Line coverage**

> A line is covered if **any instruction on that line was executed**

---

### 3. **Branch coverage (C1)**

> Tracks decision points (`if`, `switch`, ternary)

Example:

```java id="u8n6ya"
if (x > 0) { ... } else { ... }
```

You need:

* one test for `true`
* one test for `false`

---

### 4. **Method coverage**

> Method is covered if **at least one instruction runs**

---

### 5. **Class coverage**

> Class is covered if **any method is executed**

---

## 🔥 Important implications

### ❗ Empty methods still affect coverage

Even this:

```java id="f2g1vh"
public void deleteTemporaryFiles() {}
```

* Contains bytecode (method entry + return)
* If never called → **missed instructions → lowers coverage**

---

### ❗ Coverage ≠ test quality

JaCoCo only checks:

> “Was this code executed?”

Not:

* correctness
* assertions
* edge cases

---

### ❗ Private / generated code counts too

Unless excluded:

* Lombok-generated code
* getters/setters
* empty overrides

All impact coverage

---

## 🧪 Example mapping

```java id="6zj7fd"
public int add(int a, int b) {
    return a + b;
}
```

Test:

```java id="6n98xv"
add(1, 2);
```

Result:

* Instruction: ✅
* Line: ✅
* Method: ✅

---

## 🎯 Why your coverage dropped

Your method:

```java id="zjz98m"
public void deleteTemporaryFiles() {}
```

* Has instructions
* Not executed by any test
  → JaCoCo marks it **missed**
  → Coverage % drops

---

## ✅ Key takeaway

> JaCoCo coverage is purely **execution-based at bytecode level**

So to increase coverage, you must:

1. Execute the code (write tests), OR
2. Exclude it from reporting
