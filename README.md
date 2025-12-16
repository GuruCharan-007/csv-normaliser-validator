CSV Normalizer & Validator

Project Description

This project is a Java-based offline CSV Normalizer and Validator.
It reads a CSV file provided by the user, normalizes the data, validates each row, and separates valid and invalid data into different output files using file handling.

Features

⦁ Reads CSV file using runtime input
⦁ Supports any number of rows and columns
⦁ Normalizes data (trimming, lowercase, missing values)
⦁ Handles inconsistent delimiters
⦁ Removes duplicate rows
⦁ Separates valid and invalid data

Technologies Used

⦁ Java
⦁ VS Code
⦁ File Handling

How to Run
javac -d bin src/app/*.java  
java -cp bin app.Main

Files Used

⦁ Main.java
⦁ CsvReader.java
⦁ Normalizer.java
⦁ Validator.java
⦁ CsvWriter.java

Input Files

⦁ Input CSV file (provided at runtime)

Output Files

⦁ clean.csv
⦁ rejects.csv
