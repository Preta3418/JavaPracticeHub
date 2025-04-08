# Java Practice Hub 🧠✨

A collection of assorted practice projects written in **Java** and **Spring Boot**, designed to explore core language features, algorithms, and backend development through modular, testable, and extensible code.

This repository serves as a **central hub** where multiple projects — from CLI-based number analyzers to full web backends — can be launched individually through a simple interactive interface.

---

## 🚀 Features

- **Practice Hub CLI**
  - A text-based main menu to navigate and run different modules

- **Amazing Numbers**
  - Analyze numeric properties
  
| Property         | Description                                                               |
|------------------|-----------------------------------------------------------------------------|
| Buzz             | Divisible by 7 or ends with 7                                               |
| Duck             | Contains at least one zero (excluding leading zero)                         |
| Palindromic      | Reads the same backward and forward (e.g. 121, 1331)                        |
| Gapful           | At least 3 digits, divisible by first+last digit formed number              |
| Spy              | Sum of digits equals product (e.g. 123 → 1+2+3 == 1×2×3)                    |
| Sunny & Square   | Sunny if `n+1` is a perfect square; square if `n` is a perfect square       |
| Jumping          | Digits differ by 1 (e.g. 123, 8987)                                         |
| Happy & Sad      | Happy if sum-of-squares of digits eventually leads to 1, otherwise Sad      |
| Even & Odd       | Basic parity check                                                          |

   
- **Will be added as project goes on**

---

## 🗂 Project Structure
Practice/
├── Hub.java                   # Central launcher for all subprojects
├── AmazingNumbers/           # CLI-based number property checker
├── src/                      # Java source code
│   └── main/java/…
├── build.gradle              # Gradle build configuration
└── README.md                 # You’re reading this!

---

## 🛠 Getting Started

### Prerequisites:
- Java 21+
- Gradle (wrapper included)
- IntelliJ IDEA or any Java IDE

### Running the Hub
From terminal or IntelliJ:

```bash
./gradlew run
