## **Lecture 8: Core Concepts of Spring Boot**

### **Inversion of Control (IoC) and Spring**

* Traditionally, we created objects manually. With Spring, we ask the framework to provide objects.
* This concept is known as *Inversion of Control* (IoC), where the control of object creation is transferred from the developer to the framework.
* The IoC container (i.e., Spring) manages all the classes (that are Spring components) and provides them when needed.

### **ApplicationContext**

* It is an implementation of the IoC container.
* It does **not** manage all the classes—only those annotated with `@Component`.
* Using `@Component` registers a class as a *Spring bean*.
* A **bean** is simply an object managed by the Spring IoC container.

### **@SpringBootApplication**

* This annotation is used only on the main class of the Spring Boot application (only once in the project).
* It combines three annotations:

  1. `@Configuration` – Marks the class as a source of bean definitions.
  2. `@EnableAutoConfiguration` – Enables Spring Boot’s auto-configuration mechanism.
  3. `@ComponentScan` – Tells Spring to scan for components, configurations, and services in the package.

### **@ComponentScan**

* It enables the scanning of classes annotated with `@Component` and registers them as beans in the IoC container.
* All components/beans should reside inside the base package; otherwise, Spring won't detect them.

### **Dependency Injection**

* When one class needs to use another class's object, we inject it using the `@Autowired` annotation (field injection).
* Spring provides the same instance of the bean to all classes that ask for it.

### **@EnableAutoConfiguration**

* Automatically configures beans based on the classpath settings and dependencies in the project.

### **@Configuration and @Bean**

* A class annotated with `@Configuration` can define beans using methods annotated with `@Bean`.
* These methods return objects that Spring registers as beans.
* `@Bean` can **only** be used on methods, not on classes or fields.

---

## **Lecture 9: JARs and REST API**

### **Types of JARs**

1. **Thin JAR** – Contains only the compiled code.
2. **Fat JAR (Uber JAR)** – Contains everything including dependencies and an embedded server (like Tomcat).

   * Creation of a Fat JAR is possible using the **Spring Boot Maven Plugin**, which performs **repacking**.
   * This happens when you run `mvn package`.

---

### **REST API in Spring Boot**

#### **@RestController**

* A special type of controller annotated with `@Component`, automatically becomes a Spring bean.
* Handles HTTP requests and responses.

#### **@RequestMapping**

* Applied at the class level to define the base URL path for all methods in the controller.

#### **HTTP Method Annotations**

* `@GetMapping`, `@PostMapping`, etc., are used on methods to define specific HTTP endpoints.
* All controller methods should be `public` so that Spring can access them.

#### **@RequestBody**

* Used in `@PostMapping` methods to capture and bind the incoming request body to a Java object.

#### **@PathVariable**

* Used to capture dynamic values from the URL path (e.g., IDs).

```java
@GetMapping("id/{myId}")
public JournalEntry getJournalEntryById(@PathVariable Long myId) {
    return journalEntries.get(myId);
}
```

#### **@RequestParam**

* Used to capture query parameters, often for filtering or optional inputs.

---

## **Lecture 12: ORM and JPA**

### **ORM (Object Relational Mapping)**

* A technique that maps Java objects to database tables.
* Allows developers to use OOP concepts to interact with relational databases.
* Operations on Java classes (insert, update, delete) reflect directly on DB tables.

### **JPA (Java Persistence API)**

* A specification that provides a standard way to implement ORM in Java.
* Includes interfaces and annotations but does **not** provide an actual implementation.
* Requires a **persistence provider** (e.g., Hibernate) to function.

### **JPA Providers / ORM Tools**

* Implement the JPA interfaces and handle actual DB interactions.
* Common providers: **Hibernate**, **EclipseLink**, **OpenJPA**.

### **Spring Data JPA**

* Built on top of JPA.
* Simplifies JPA usage by providing high-level abstractions and utility methods.
* It still requires a JPA implementation like Hibernate underneath.
* JPA is designed for RDBMS (Relational Databases); not suitable for NoSQL databases like MongoDB.

#### **Ways to Interact with DB using Spring Data JPA:**

1. **Query Method DSL** – Uses method naming conventions to define queries.
2. **Criteria API** – Provides a dynamic, programmatic way to build complex queries.

---

## **Lecture 14: ResponseEntity**

### **ResponseEntity**

* A class provided by Spring to customize HTTP responses.
* Can be used to set:

  * HTTP status codes (e.g., 200 OK, 404 Not Found)
  * Headers
  * Response body (e.g., JSON, XML, HTML)
* Supports generics to define the response data type:

```java
return ResponseEntity.ok(myObject);
```

---

## **Lecture 15: Lombok**

### **Lombok**

* A Java library that helps reduce boilerplate code (getters, setters, constructors, etc.).
* Adds code at **compile-time** using annotations.
* Common annotations:

  * `@Getter`
  * `@Setter`
  * `@NoArgsConstructor`
  * `@AllArgsConstructor`
  * `@Data` (includes getter, setter, toString, equals, hashCode)

#### **Setup**

* Add the Maven dependency from [Project Lombok’s website](https://projectlombok.org).
* Install Lombok plugin in IntelliJ IDEA or your preferred IDE.

---

## **Lecture 17: @Transactional and Transaction Management**

### **@Transactional**

* Used to mark a method so that all DB operations inside it are executed in a **transactional** context.
* Ensures **atomicity** and **isolation** – either all operations succeed, or none do (rollback).

### **@EnableTransactionManagement**

* Applied on the main class to enable transaction management in the Spring application.
* Tells Spring to look for and manage methods annotated with `@Transactional`.

### **PlatformTransactionManager**

* An interface that manages transactions in Spring.
* Spring uses an implementation of this interface to control transactions.
* You must define a **bean** of this implementation to let Spring know how to manage transactions.
