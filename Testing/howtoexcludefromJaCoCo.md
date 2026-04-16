There are **three clean strategies**, and which one you choose depends on how much control you want vs how “automatic” it should be.

---

# ✅ 1. Best modern approach: use `@Generated` (recommended)

JaCoCo can ignore anything annotated with `@Generated`.

### Step 1 — Enable Lombok to add `@Generated`

In your `lombok.config` file:

```properties
lombok.addLombokGeneratedAnnotation = true
```

👉 This makes Lombok generate code like:

```java
@Generated
public String getName() { ... }
```

---

### Step 2 — Ensure JaCoCo respects it

JaCoCo **already ignores `@Generated`** annotations if configured properly (newer versions do this automatically).

If needed (Maven example):

```xml
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.8.8</version>
</plugin>
```

👉 Versions ≥ **0.8.2** support filtering generated code
👉 Versions ≥ **0.8.8+** handle Lombok very well

---

# ✅ 2. Exclude patterns (for getters/setters / DTOs)

If you want broader exclusion (e.g., DTOs, models):

## Maven

```xml
<configuration>
  <excludes>
    <exclude>**/model/**</exclude>
    <exclude>**/dto/**</exclude>
    <exclude>**/*Builder.class</exclude>
  </excludes>
</configuration>
```

## Gradle

```groovy
jacocoTestReport {
    classDirectories.setFrom(files(classDirectories.files.collect {
        fileTree(dir: it, exclude: [
            '**/model/**',
            '**/dto/**',
            '**/*Builder.class'
        ])
    }))
}
```

---

# ✅ 3. Handle empty overrides explicitly

For methods like:

```java
@Override
public void deleteTemporaryFiles() {}
```

JaCoCo does **NOT automatically ignore these**.

### Option A — annotate manually

```java
import javax.annotation.Generated;

@Generated
@Override
public void deleteTemporaryFiles() {}
```

---

### Option B — just test them (simplest)

```java
@Test
void deleteTemporaryFiles_shouldNotFail() {
    new LocalFileManager().deleteTemporaryFiles();
}
```

---

# ⚠️ Important limitations

## ❌ JaCoCo does NOT natively exclude:

* getters/setters (unless annotated)
* empty methods
* interface overrides

👉 It only excludes:

* code marked as `@Generated`
* certain compiler-generated constructs (synthetics, bridges)

---

# 🧠 What most teams do (practical standard)

**Combination approach:**

1. ✅ Enable Lombok `@Generated`
2. ✅ Upgrade JaCoCo (≥ 0.8.8)
3. ✅ Exclude DTO/model packages if needed
4. ✅ Write trivial tests for empty overrides

---

# 🎯 Recommended setup for you

Given your situation:

### Do this:

```properties
# lombok.config
lombok.addLombokGeneratedAnnotation = true
```

Then:

* Keep JaCoCo updated
* Add a **1-line test for empty methods**

---

# 🔥 Pro tip

If you want very clean reports:

* Exclude:

  * DTOs
  * Entities
  * Generated classes
* Keep coverage focused on:

  * business logic
  * services
  * core processing
