# Java Practice Hub 🧠✨

A collection of assorted practice projects written in **Java** and **Spring Boot**, designed to explore core language features, algorithms, and backend development through modular, testable, and extensible code.

This repository serves as a **central hub** where multiple projects — from CLI-based number analyzers to full web backends — can be launched individually through a simple interactive interface.

---

## 🚀 Features

- **Practice Hub CLI**
  - A text-based main menu to navigate and run different modules
  - Currently includes: `Amazing Numbers`

- **Amazing Numbers**
  - Analyze numeric properties
  
    Buzz	number    : divisible by 7 or ends with 7.
    Duck number    : contains at least one zero (excluding leading zero).
    Palindromic	   : Reads the same backward and forward (e.g. 121, 1331).
    Gapful	        : 3 digits and divisible by the number formed by first and last digit.
    Spy	Sum        : digits equals product of digits (e.g. 123: 1+2+3 == 1×2×3).
    Sunny & Square : if n+1 is a perfect square. A number is square if it’s a perfect square.
    Jumping	Digits : subsequent number differ by 1 (e.g. 123, 8987).
    Happy & Sad	    : numbers which eventually reach 1 when replaced by the sum of the squares of their digits is "happy". Otherwise, they’re "sad".
    Even & Odd	

   
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
