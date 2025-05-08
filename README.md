# Assignment: Build a Spring Boot REST API with In-Memory Storage (No Database)


## 📌 Objective
You are required to build a simple CRUD (Create, Read, Update, Delete) REST API using Spring Boot. The goal of this exercise is to strengthen your understanding of core Java, Spring Boot, and RESTful web services, while using in-memory data structures instead of a database.

## 📚 Background
Assume you're developing a microservice that manages a simple entity (e.g., User, Student, or Employee). The system must support basic CRUD operations via HTTP requests.
You will use Java collections (like List, Map, etc.) to simulate the data layer. This means you won't use any actual database like MySQL, MongoDB, or H2.

## 🧾 Requirements
1.	Entity Definition
      o	Choose an entity such as User, Student, or Employee.
      o	Define at least 3 fields (e.g., ID, name, email).
      o	Include appropriate constructors, getters, and setters.
2.	Endpoints (REST APIs)
      Build the following endpoints for your entity:
      o	POST /<entity> → Create a new record
      o	GET /<entity> → Fetch all records
      o	GET /<entity>/{id} → Fetch a record by ID
      o	PUT /<entity>/{id} → Update a record by ID
      o	DELETE /<entity>/{id} → Delete a record by ID
3.	In-Memory Data Handling
      o	Use a Java collection (such as Map<Integer, Entity>) to store records.
      o	Data should persist only during application runtime.
4.	Service Layer
      o	Write a service class to contain all the business logic.
      o	Handle ID generation, lookup, and deletion here.
5.	Exception Handling
      o	Implement proper error handling when:
      	A record is not found by ID
      	Invalid input is provided
      o	Return meaningful HTTP status codes and messages.
6.	Project Structure
      o	Maintain clear separation of layers: controller, service, model.
      o	Use standard Spring Boot practices and annotations.

## ✅ Deliverables
•	A working Spring Boot application.
•	Clean, well-structured code with appropriate comments .
 
