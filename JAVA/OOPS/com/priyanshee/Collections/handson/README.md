# 🎓 University Course Registration System

A modular and scalable university course registration system implemented using the Java Collections Framework.

## 📌 Features

- ✅ Student registration with waitlisting  
- ✅ Course dropping with automatic waitlist promotion  
- ✅ List enrolled students (sorted by name)  
- ✅ List students by branch across courses  
- ✅ Filter courses by instructor or credit  
- ✅ View all students in the university grouped by branch  
- ✅ Sorted listing of courses by enrollment count  

## 🛠 Technologies Used

- Java Collections Framework (`HashMap`, `TreeSet`, `Queue`, `List`)  
- Modular package structure (`model`, `service`, `main`, `util`)  

---

## 📦 Package Structure

```

src/
├── main/
│   └── Main.java                  # Menu-driven application entry point
├── model/
│   ├── Student.java              # Student model with equals & hashCode
│   └── Course.java               # Course model with enrollment logic
├── service/
│   └── RegistrationSystem.java   # Core business logic and collections

```

---

## 📋 Sample Console Menu

```

\========== University Course Registration ==========

1. Register Student to Course
2. Drop Student from Course
3. List Students in a Course
4. List Students by Branch
5. List Courses Sorted by Enrollment
6. Filter Courses by Instructor
7. Filter Courses by Credit
8. View All Students in University
9. Exit

\=====================================================

```

---

## 🧪 Sample Interactions

```

\------ Register Student ------
Enter Student ID: S11
Enter Name: John Doe
Enter Email: [john@example.com](mailto:john@example.com)
Enter Year: 2
Enter Branch: CS
Enter Course ID: C101
✅ John Doe registered to Data Structures

\------ Drop Student ------
Enter Student ID to Drop: S11
Enter Course ID: C101
✅ John Doe dropped from Data Structures

```

---

## 🧑‍🎓 Sample Data

- 15+ students from various branches (CS, IT, EC, ME)  
- 5+ courses with different capacities and instructors  
- Pre-seeded enrollments and waitlists to test dropping and promotion  

---

## ✍️ Developer Notes

- `TreeSet<Student>` used for sorted enrolled students.  
- `LinkedList<Student>` used as waitlist (`Queue`) to maintain FIFO.  
- `HashMap<String, Student>` and `HashMap<String, Course>` for O(1) lookup.  
- `Comparator` used for sorting by name, enrollment, etc.  
- Modular separation of model, logic, and utilities.  

