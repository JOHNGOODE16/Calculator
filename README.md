A simple desktop calculator built with Java 24, JavaFX, and Maven. Supports basic operations with a running history display.

## Features
- Digits 0–9 input
- Addition, subtraction, multiplication, division
- `C` (Clear) and `CE` (Clear Entry)
- History label for tracking calculations
- JavaFX UI (FXML-based)

## Tech Stack
- **Language:** Java 24  
- **UI:** JavaFX  
- **Build:** Maven

## Requirements
- Java **24** (JDK 24)
- Maven **3.9+**
- JavaFX **24.0.2**

## Getting Started
```bash
git clone https://github.com/JOHNGOODE16/Calculator
cd Calculator
mvn clean compile
mvn javafx:run


##Structure
src/main/java/com/calculator/
  ├─ Main.java
  ├─ Controller.java
  └─ CalculatorHelper.java
src/main/resources/com/calculator/
  └─ GUI.fxml
```

Usage

Click digits to enter a number.

Click an operator (+, -, ×, ÷).

Press = to calculate the result.

CE clears only the current entry.

C clears both the current entry and history.
