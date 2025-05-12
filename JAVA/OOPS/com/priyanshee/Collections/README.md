# Java Collections Framework – Assignment (Advanced)

## Instructions

* Use appropriate collection types based on the use case.
* Focus on correct usage of generics, sorting, filtering, and efficient operations.
* Follow clean code practices and maintain a modular structure.

---

## Problem 1: Advanced Student Management (List, Comparator, Map)

* Create a `Student` class with fields: `id`, `name`, `age`, `grade`, and `branch`.
* Store at least 15 students in an `ArrayList`.
* Sort students:

  * First by `branch`.
  * Then by `grade` in descending order.
* Group students by `branch` using `Map<String, List<Student>>`.

---

## Problem 2: Unique Word Frequency Counter (Map, TreeSet)

* Given a paragraph, calculate and print:

  * Total number of unique words.
  * Frequency count of each word.
  * Display words sorted alphabetically.

---

## Problem 3: Department Directory with Sorted Employees (Map, List)

* Maintain a `Map<String, List<Employee>>` where key is the department name.
* Sort employees in each department by salary (descending).
* Provide a method to return top **N** paid employees across all departments.

---

## Problem 4: Task Prioritization Engine (PriorityQueue, Comparator)

* Create a `Task` class with fields: `name`, `priority`, `deadline`.
* Use a `PriorityQueue` to order tasks by:

  * Closest deadline first.
  * Highest priority next.
* Poll and print tasks in the execution order.

---

## Problem 5: Product Catalog System (TreeMap, Comparator)

* Create a `Product` class with fields: `id`, `name`, `price`, `rating`, `stock`.
* Store products in a `TreeMap<Integer, Product>` keyed by `id`.
* Sort and print products by:

  * Descending `rating`.
  * Then by `name`.

---

## Problem 6: Library Catalog (Map\<String, Set<Book>>)

* Maintain a catalog where each `genre` maps to a `Set<Book>`.
* Prevent duplicate books using `equals()` and `hashCode()`.
* Print all books in a genre sorted by `publication year`.

---

## Problem 7: Movie Rating Aggregator (Map, List)

* Store movie ratings using `Map<String, List<Integer>>`.
* Compute and display:

  * Average rating per movie.
  * Sort movies by average rating in descending order.

---

## Problem 8: Employee Hierarchy System (Map, TreeMap)

* Maintain hierarchy with `Map<Manager, TreeMap<Level, List<Employee>>>`.
* Print employees reporting to each manager at every level.

---

## Problem 9: Leaderboard Tracker (TreeSet, Comparator)

* Track player scores using `TreeSet<Player>` sorted by score (descending).
* Update player scores and maintain the correct leaderboard order.

---

## Problem 10: Bank Transaction Log (Map, List)

* Use `Map<String, List<Transaction>>` keyed by account number.
* Generate account statements by sorting transactions by time.

---

## Problem 11: Company Asset Tracker (Map\<String, Set<Asset>>)

* Store assets per department with unique `Asset` objects.
* Detect and report duplicate asset IDs globally across departments.

---

## Problem 12: Voting System (Map\<String, Integer>)

* Build a voting system to:

  * Tally votes for each candidate.
  * Sort and display candidates by vote count in descending order.

---

## Problem 13: Flight Booking Manager (Queue, Map)

* Use a `Queue` to handle booking requests (FIFO order).
* Use a `Map` to store confirmed bookings with seat numbers.
* Process bookings and update the confirmed list accordingly.

---

## Problem 14: Restaurant Order System (Deque, List)

* Manage current orders using a `Deque<Order>`.

  * Support adding/removing orders from both ends.
* Maintain an order history using a `List<Order>`.

---

## Problem 15: College Subject Allotment (Map\<String, List<String>>)

* Store subject allotments per student using `Map<String, List<String>>`.
* Provide a reverse lookup feature:

  * Find all students who chose a specific subject.
