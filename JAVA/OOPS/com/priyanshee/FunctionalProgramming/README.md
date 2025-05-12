
## 🟢 Level 1 – Basics (Lambdas & Functional Interfaces)

1️⃣ Write a Predicate<String> that returns true if a string starts with “A”.
2️⃣ Create a Function\<String, Integer> that returns the length of a string.
3️⃣ Use a Consumer<String> to print a string in uppercase.
4️⃣ Write a Supplier<Double> that generates a random number.
5️⃣ Use a lambda expression to sort a list of strings alphabetically.
6️⃣ Create a BiFunction\<Integer, Integer, Integer> that returns the sum.
7️⃣ Create a Runnable lambda that prints “Hello Functional Java”.

---

## 🟡 Level 2 – Stream Operations (map, filter, collect)

8️⃣ Filter a list of integers to only even numbers.
9️⃣ Convert a list of strings to uppercase using map().
🔟 Given a list of names, return a list of names longer than 4 characters.
1️⃣1️⃣ Count how many strings in a list start with “S”.
1️⃣2️⃣ Find the longest string in a list using reduce().
1️⃣3️⃣ Sort a list of integers in descending order using streams.
1️⃣4️⃣ Convert a list of integers into a list of their squares.
1️⃣5️⃣ From a list of words, create a list of their lengths.

---

## 🟠 Level 3 – Collectors, Optional, Advanced Streams

1️⃣6️⃣ Group a list of names by their first letter using Collectors.groupingBy().
1️⃣7️⃣ Partition a list of integers into even and odd using Collectors.partitioningBy().
1️⃣8️⃣ Join a list of strings into a single comma-separated string.
1️⃣9️⃣ Find the first element in a list of integers that is divisible by 5 using findFirst().
2️⃣0️⃣ Use Optional to safely get a value or return a default.
2️⃣1️⃣ Convert a list of integers to a Set using Collectors.toSet().

---

## 🔵 Level 4 – Complex Operations and Composition

2️⃣2️⃣ Write a function that takes a list of strings and returns a map of word to its length.
2️⃣3️⃣ Compose two functions: one that converts string to uppercase and one that appends “!”.
2️⃣4️⃣ Chain multiple stream operations: filter > map > sort > collect.
2️⃣5️⃣ Given a list of people (name, age), filter adults (age > 18) and collect names.
2️⃣6️⃣ From a list of words, remove duplicates and return sorted result.
2️⃣7️⃣ Compute the average length of strings in a list.
2️⃣8️⃣ Find the product of all even numbers in a list using reduce().

---

## 🟣 Level 5 – Custom Functional Interfaces and Real-Life Use Cases

2️⃣9️⃣ Create your own functional interface called TriFunction\<T, U, V, R> (takes 3 args).
3️⃣0️⃣ Implement a function pipeline to process orders (e.g., filter by status, sort by amount, map to customer name).
3️⃣1️⃣ Given a list of transactions (with amount and type), calculate the total amount for type "DEBIT" using streams.
3️⃣2️⃣ From a list of students with names and grades, return a list of names of students who scored above 80, sorted alphabetically.
3️⃣3️⃣ Create a stream pipeline to flatten a list of lists of integers and return the distinct even numbers.
3️⃣4️⃣ Given a list of Employee objects, group them by department and count how many employees are in each department.
3️⃣5️⃣ Calculate the average salary of employees in each department using Collectors.groupingBy() and averagingDouble().

---

## 🟤 Custom Types & Nested Streams

3️⃣6️⃣ You have a list of Order objects, each with a list of Items. Return a flat list of all item names.
3️⃣7️⃣ Find the order with the highest total item price.
3️⃣8️⃣ Given a list of products with category and rating, return a map of category → highest-rated product name.
3️⃣9️⃣ Create a function that takes a list of people and returns a map of age group (<20, 20-40, 40+) → list of people.
4️⃣0️⃣ Convert a CSV string of numbers ("1,2,3,4") into a List<Integer> using streams and lambdas.

---

## 🟩 Function Composition & Pipelines

4️⃣1️⃣ Build a reusable pipeline of 3 functions: trim, lowercase, and remove punctuation from strings.
4️⃣2️⃣ Compose two functions: one for string parsing (String -> Integer) and one for doubling the number (Integer -> Integer).
4️⃣3️⃣ Write a generic method that accepts a List<T> and a Function\<T, R> and applies the function to all elements.
4️⃣4️⃣ Implement compose() and andThen() examples using Function\<T, R>.

---

## 🟧 Collectors & Summarization

4️⃣5️⃣ Given a list of books, generate a summary object with total count, average rating, and total price.
4️⃣6️⃣ Write a program that groups a list of employees by joining year, and then finds the max salary in each year.
4️⃣7️⃣ From a list of comments, count the number of comments by each user.

---

## 🟥 Advanced Optional & Stream API

4️⃣8️⃣ Safely get the third element of a list using stream().skip(2).findFirst() and return Optional<T>.
4️⃣9️⃣ Given a list of URLs (strings), use streams to validate them using a Predicate<String> and return only valid ones.
5️⃣0️⃣ Chain operations on a list of Orders: filter by date range, map to total amount, sum all totals.

---

## 🏁 Bonus: Real-Life Mini Challenges

5️⃣1️⃣ Implement a text analyzer: given a paragraph, split into words, count frequency of each word, and return a map.
5️⃣2️⃣ Create a reusable method that filters a list based on a passed-in Predicate<T> and logs each filtered item.
5️⃣3️⃣ From a list of dates, return the earliest and latest date using a custom comparator and stream operations.
5️⃣4️⃣ Create a program that returns the top 3 longest strings from a list, using streams.
5️⃣5️⃣ Simulate a batch job: given a list of jobs (name, status), return only failed job names in uppercase, sorted alphabetically.
