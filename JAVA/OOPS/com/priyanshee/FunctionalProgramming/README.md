## Level 1 – Basics (Lambdas & Functional Interfaces)

1. Write a Predicate<String> that returns true if a string starts with “A”.
2. Create a Function\<String, Integer> that returns the length of a string.
3. Use a Consumer<String> to print a string in uppercase.
4. Write a Supplier<Double> that generates a random number.
5. Use a lambda expression to sort a list of strings alphabetically.
6. Create a BiFunction\<Integer, Integer, Integer> that returns the sum.
7. Create a Runnable lambda that prints “Hello Functional Java”.

---

## Level 2 – Stream Operations (map, filter, collect)

8. Filter a list of integers to only even numbers.
9. Convert a list of strings to uppercase using map().
10. Given a list of names, return a list of names longer than 4 characters.
11. Count how many strings in a list start with “S”.
12. Find the longest string in a list using reduce().
13. Sort a list of integers in descending order using streams.
14. Convert a list of integers into a list of their squares.
15. From a list of words, create a list of their lengths.

---

## Level 3 – Collectors, Optional, Advanced Streams

16. Group a list of names by their first letter using Collectors.groupingBy().
17. Partition a list of integers into even and odd using Collectors.partitioningBy().
18. Join a list of strings into a single comma-separated string.
19. Find the first element in a list of integers that is divisible by 5 using findFirst().
20. Use Optional to safely get a value or return a default.
21. Convert a list of integers to a Set using Collectors.toSet().

---

## Level 4 – Complex Operations and Composition

22. Write a function that takes a list of strings and returns a map of word to its length.
23. Compose two functions: one that converts string to uppercase and one that appends “!”.
24. Chain multiple stream operations: filter > map > sort > collect.
25. Given a list of people (name, age), filter adults (age > 18) and collect names.
26. From a list of words, remove duplicates and return sorted result.
27. Compute the average length of strings in a list.
28. Find the product of all even numbers in a list using reduce().

---

## Level 5 – Custom Functional Interfaces and Real-Life Use Cases

29. Create your own functional interface called TriFunction\<T, U, V, R> (takes 3 args).
30. Implement a function pipeline to process orders (e.g., filter by status, sort by amount, map to customer name).
31. Given a list of transactions (with amount and type), calculate the total amount for type "DEBIT" using streams.
32. From a list of students with names and grades, return a list of names of students who scored above 80, sorted alphabetically.
33. Create a stream pipeline to flatten a list of lists of integers and return the distinct even numbers.
34. Given a list of Employee objects, group them by department and count how many employees are in each department.
35. Calculate the average salary of employees in each department using Collectors.groupingBy() and averagingDouble().

---

## Custom Types & Nested Streams

36. You have a list of Order objects, each with a list of Items. Return a flat list of all item names.
37. Find the order with the highest total item price.
38. Given a list of products with category and rating, return a map of category → highest-rated product name.
39. Create a function that takes a list of people and returns a map of age group (<20, 20-40, 40+) → list of people.
40. Convert a CSV string of numbers ("1,2,3,4") into a List<Integer> using streams and lambdas.

---

## Function Composition & Pipelines

41. Build a reusable pipeline of 3 functions: trim, lowercase, and remove punctuation from strings.
42. Compose two functions: one for string parsing (String -> Integer) and one for doubling the number (Integer -> Integer).
43. Write a generic method that accepts a List<T> and a Function\<T, R> and applies the function to all elements.
44. Implement compose() and andThen() examples using Function\<T, R>.

---

## Collectors & Summarization

45. Given a list of books, generate a summary object with total count, average rating, and total price.
46. Write a program that groups a list of employees by joining year, and then finds the max salary in each year.
47. From a list of comments, count the number of comments by each user.

---

## Advanced Optional & Stream API

48. Safely get the third element of a list using stream().skip(2).findFirst() and return Optional<T>.
49. Given a list of URLs (strings), use streams to validate them using a Predicate<String> and return only valid ones.
50. Chain operations on a list of Orders: filter by date range, map to total amount, sum all totals.

---

## Bonus: Real-Life Mini Challenges

51. Implement a text analyzer: given a paragraph, split into words, count frequency of each word, and return a map.
52. Create a reusable method that filters a list based on a passed-in Predicate<T> and logs each filtered item.
53. From a list of dates, return the earliest and latest date using a custom comparator and stream operations.
54. Create a program that returns the top 3 longest strings from a list, using streams.
55. Simulate a batch job: given a list of jobs (name, status), return only failed job names in uppercase, sorted alphabetically.
