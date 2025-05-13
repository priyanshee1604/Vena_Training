## ✅ **Java Naming Conventions**

### 1. **Packages**

* **All lowercase**.
* **No camelCase, underscores, or hyphens**.
* If multiple words: **concatenate them in lowercase**.
* **Example**:
  `com.example.projectname`, `org.company.crm`

---

### 2. **Classes & Interfaces**

* **PascalCase** (Each word starts with a capital letter).
* Should be **noun or noun phrases**.
* **Example**:
  `Student`, `AccountManager`, `PaymentGateway`

---

### 3. **Methods**

* **camelCase** (first word lowercase, next words capitalized).
* Should be **verb or verb phrases**.
* **Example**:
  `calculateTotal()`, `sendEmailNotification()`

---

### 4. **Variables**

* **camelCase**.
* Should be **descriptive**, use nouns.
* **Example**:
  `studentName`, `totalAmount`, `userId`

---

### 5. **Constants (Static Final Variables)**

* **All uppercase**.
* **Words separated by underscores**.
* **Example**:
  `MAX_RETRIES`, `DEFAULT_TIMEOUT`, `PI`

---

### 6. **Enums**

* Enum names: **PascalCase**.
* Enum constants: **ALL\_UPPERCASE with underscores if needed**.
* **Example**:

  ```java
  public enum OrderStatus {
      PENDING, SHIPPED, DELIVERED, CANCELLED
  }
  ```

---

### 7. **Type Parameters (Generics)**

* **Single uppercase letters**, meaningful if possible.
* Common: `T` (Type), `E` (Element), `K` (Key), `V` (Value), `N` (Number).
* **Example**:

  ```java
  public interface List<T> { ... }
  ```

---

### 8. **Annotations**

* Same as classes: **PascalCase**.
* Should be adjective-like.
* **Example**:
  `@Override`, `@Deprecated`, `@Transactional`

---

## ✅ **Summary Table**

| Element         | Convention       | Example                       |
| --------------- | ---------------- | ----------------------------- |
| **Package**     | lowercase        | `com.example.myproject`       |
| **Class**       | PascalCase       | `CustomerService`             |
| **Interface**   | PascalCase       | `DataRepository`              |
| **Method**      | camelCase        | `processOrder()`              |
| **Variable**    | camelCase        | `orderCount`, `userName`      |
| **Constant**    | UPPERCASE + `_`  | `MAX_SIZE`, `DEFAULT_TIMEOUT` |
| **Enum**        | PascalCase       | `OrderStatus`                 |
| **Enum Values** | UPPERCASE + `_`  | `PENDING`, `IN_PROGRESS`      |
| **Type Param**  | Single uppercase | `T`, `E`, `K`, `V`            |
| **Annotation**  | PascalCase       | `@Service`, `@RequestMapping` |

---

### ✅ **Bonus Tip:**

* **Local Variables**: Use short but meaningful names.
* **Fields / Member Variables**: Use `camelCase`.
* **Booleans**: Should sound like a question.

  * Example: `isActive`, `hasPermission`, `canEdit`.

---

### ✅ **Golden Rule**:

> 🔹 Be consistent
> 🔹 Be meaningful
> 🔹 Follow community standards
