# Java 8 Features & Stream API Practice — @Bhavesh-070

A dedicated repository containing structured examples, revision exercises, and commonly asked interview problems on **Java 8 Features** (Streams, Lambdas, Functional Interfaces, Optional, and Method References).

---

## 📚 Topics Covered

| # | Topic | Description | Source Code |
|:---:|:---|:---|:---:|
| 01 | **Stream API: `filter()` & `collect()`** | Filtering elements based on predicate conditions (e.g. even numbers, salary thresholds) | [Problem_01.java](src/com/revision/streams/Problem_01.java) |
| 02 | **Stream API: `map()` & Method References** | Transforming strings using `String::toUpperCase` and filtering by length | [Problem_02.java](src/com/revision/streams/Problem_02.java) |

---

## 📁 Repository Structure

```text
java-8-features/
├── .gitignore
├── README.md
└── src/
    └── com/
        └── revision/
            ├── streams/                 # Stream API operations (filter, map, flatMap, reduce, groupingBy)
            │   ├── Problem_01.java
            │   └── Problem_02.java
            ├── functional_interfaces/   # Predicate, Function, Consumer, Supplier
            ├── lambdas/                 # Lambda syntax & method references (::)
            └── optional/                # Optional handling & avoiding NPEs
```

---

## 🚀 How to Run

Compile and execute directly with Java 8+ or open the project in VS Code / Eclipse:

```bash
# Compile
javac -d bin src/com/revision/streams/Problem_01.java

# Run
java -cp bin com.revision.streams.Problem_01
```

---

*Continuous revision of core Java 8 concepts for technical interviews.*
