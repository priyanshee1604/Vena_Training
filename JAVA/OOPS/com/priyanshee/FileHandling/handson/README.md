# 📝 Java File I/O Problem Worksheet

## **Title**: Log File Analyzer

---

## 🎯 **Objective**

Build a Java application that reads a server log file, analyzes it, and generates a summary report.

---

## 📝 **Problem Description**

You are given a log file named:
`server.log`

Your Java program must perform the following tasks:

1. **Read the file line by line.**

2. **Analyze the data**:

    * Count the total number of log entries (lines).
    * Count the number of lines that contain the word `"ERROR"`.
    * Count the number of lines that contain the word `"WARNING"`.

3. **Write the results to a new file named**:
   `summary.txt`
   The report should be **neatly formatted**.

4. **Handle exceptions**:

    * If the input file is not found, print an error message.
    * If there is an I/O error during reading or writing, handle it gracefully.

---

## 📂 **Input File Example (server.log)**:

```plaintext
INFO Server started at 10:00AM
WARNING Disk space low
ERROR Failed to connect to database
INFO User login successful
ERROR Timeout occurred
```

---

## 📄 **Expected Output File (summary.txt)**:

```plaintext
Log Summary Report
------------------
Total log entries: 5
ERROR entries: 2
WARNING entries: 1
```

---

## ✅ **Requirements**:

* Use `BufferedReader` or `Files.readAllLines()` for reading.
* Use `BufferedWriter`, `PrintWriter`, or `Files.write()` for writing.
* Use `try-with-resources` or ensure streams are properly closed.
* Add meaningful comments in your code.

---

## 🌟 **Bonus (Optional)**:

* Also print the **percentage of ERROR and WARNING lines** in the report.
* Allow the program to take the **input and output file names as command-line arguments**.