# Student Grade Calculator

## Description
The Student Grade Calculator is a console-based Java application that allows users to enter subjects along with corresponding marks. It calculates the average percentage and assigns a final grade based on the average. This tool is helpful for students or educators who want to quickly input grades, view the calculated average, and determine an overall grade.

## Features
- **Subject and Mark Entry**: Enter multiple subjects and their corresponding marks.
- **Average Calculation**: Automatically calculates the average percentage based on entered marks.
- **Grade Assignment**: Assigns a letter grade based on the average percentage:
  - **A+**: 90% and above
  - **A**: 80% - 89%
  - **B**: 70% - 79%
  - **C**: 60% - 69%
  - **D**: 50% - 59%
  - **E**: 30% - 39%
  - **F**: Below 30%
- **Tabular Output**: Displays a formatted table of subjects, marks, average percentage, and final grade.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed (Java 8 or higher).

### Running the Program
1. Clone or download the code.
2. Compile the program:
   ```bash
   javac StudentGradeCalculator.java
   ```
3. Run the program:
   ```bash
   java StudentGradeCalculator
   ```

## How to Use
1. Run the program.
2. For each subject, enter the subject name and mark separated by a comma (e.g., `Math,75`).
3. Type `'done'` when you have entered all subjects and marks.
4. The program will display:
   - A table of subjects and marks.
   - The calculated average percentage.
   - The final grade based on the average.

## Example Output
```
Welcome to the Student Grade Calculator.
Please enter the subject name then enter the mark afterwards separated by a comma.
e.g. Life Orientation,70
Enter 'done' when you're done.

Enter subject and mark: Math,75
75 added successfully.
Enter subject and mark: Science,85
85 added successfully.
Enter subject and mark: History,60
60 added successfully.
Enter subject and mark: done
--------------------------------------
|Subject Name                |Mark|
--------------------------------------
|Math                        |75  |
|Science                     |85  |
|History                     |60  |
--------------------------------------
|Average Percentage Achieved |73  |
--------------------------------------
|Grade                       |B   |
--------------------------------------
```

## Notes
- **Input Format**: Enter the subject and mark in the specified format (`Subject,Mark`). Any errors in formatting will prompt an error message.
- **Valid Marks**: Marks should be positive numbers. Invalid entries may cause an error message.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
