
## 🧠 Why are there so many ways?

Because **different tasks need different tools**. For example:

* Do you want to read the file **line by line**?
* Do you need to read **the whole file at once**?
* Are you reading **text or binary data**?
* Are you working with **big or small files**?

---

## ✅ Simple and Common Ways to Read a File in Java

### 1. **BufferedReader** – Best for reading **line by line**

> Use this if you're reading a **text file**, like a log file or a list of names.

**How it works**:

```java
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
reader.close();
```

🟢 **Use when**:

* File is **text**
* You want to read it **line by line**
* File is not huge

---

### 2. **Scanner** – Good for reading line by line or word by word

> A bit easier to use than BufferedReader for small tasks.

**How it works**:

```java
Scanner scanner = new Scanner(new File("file.txt"));
while (scanner.hasNextLine()) {
    System.out.println(scanner.nextLine());
}
scanner.close();
```

🟢 **Use when**:

* You need to read **text**
* You want to break it into **words**, **numbers**, or **lines**
* You're doing **simple parsing**

---

### 3. **Files.readAllLines** – Read the **whole file at once**

> This reads all lines into a list. Simple and clean for small files.

**How it works**:

```java
List<String> lines = Files.readAllLines(Paths.get("file.txt"));
for (String line : lines) {
    System.out.println(line);
}
```

🟢 **Use when**:

* File is **small**
* You want **all lines together**
* You want clean and modern code

---

### 4. **Files.lines (Java 8+)** – Like above, but uses **Streams**

> This is modern and powerful if you like functional programming style.

**How it works**:

```java
Files.lines(Paths.get("file.txt")).forEach(System.out::println);
```

🟢 **Use when**:

* You want to use **Streams**
* You want a clean **one-liner**
* File is **not too big**

---

### 5. **FileInputStream** – Read file as **bytes**

> Good for **binary files** like images, audio, or when you don’t care about lines.

**How it works**:

```java
FileInputStream fis = new FileInputStream("file.txt");
int data;
while ((data = fis.read()) != -1) {
    System.out.print((char) data);
}
fis.close();
```

🟢 **Use when**:

* You’re reading **binary data**
* Or you want **full control** over how bytes are read

---

### 6. **RandomAccessFile** – Read from a specific **position**

> Good for jumping to parts of a file.

**How it works**:

```java
RandomAccessFile raf = new RandomAccessFile("file.txt", "r");
String line = raf.readLine();
System.out.println(line);
raf.close();
```

🟢 **Use when**:

* You need **random access** (go to line 1000, not from the start)
* More advanced use case
---

## 🚦 Quick Decision Guide

| Goal                          | Best Method            |
| ----------------------------- | ---------------------- |
| Read text line by line        | `BufferedReader`       |
| Read text word by word        | `Scanner`              |
| Read entire small text file   | `Files.readAllLines()` |
| Use streams (Java 8+)         | `Files.lines()`        |
| Read binary data              | `FileInputStream`      |
| Read from a specific position | `RandomAccessFile`     |
| Read huge file, high speed    | `FileChannel` (NIO)    |
| Use ready-made shortcuts      | Apache Commons IO      |

---

| Method               | Line-by-line | Fast | Encoding Support  | Use Case                 |
| -------------------- | ------------ | ---- | ----------------- | ------------------------ |
| FileReader           | ❌            | ❌    | ❌                 | Simple small text files  |
| BufferedReader       | ✅            | ✅    | ❌                 | Large text files         |
| Scanner              | ✅            | ⚠️   | ❌                 | Parsing tokens/words     |
| Files.readAllLines() | ✅ (in mem)   | ❌    | ✅ (default UTF-8) | Small files, all at once |
| Files.lines()        | ✅ (stream)   | ✅    | ✅                 | Modern, lazy, efficient  |
| FileInputStream      | ❌            | ✅    | ❌                 | Binary files             |
| InputStreamReader    | ❌            | ✅    | ✅                 | Text files with encoding |
