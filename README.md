☕ JDBC Codes – Java Database Connectivity Examples

A collection of Java JDBC programs demonstrating how to connect Java applications with a relational database and perform common database operations such as Insert, Update, Delete, Display, Batch Processing, PreparedStatement, and CallableStatement.

This repository is designed for students, beginners, and Java developers who want practical examples of JDBC concepts used in real-world applications.

📌 Project Overview

The JDBC Codes project contains multiple standalone Java programs that showcase how to interact with a database using JDBC APIs.
It covers both basic and advanced operations, helping developers understand:

Database connectivity in Java

SQL execution using Statement and PreparedStatement

Stored procedure execution using CallableStatement

Batch processing for performance optimization

✨ Key Features

✅ Simple JDBC connection examples

✅ Insert, Update, Delete operations

✅ Data retrieval and display programs

✅ PreparedStatement usage for secure queries

✅ CallableStatement for stored procedures

✅ Batch Insert implementation

✅ Beginner-friendly code structure

📂 Project Structure
JDBC/
 ├── Batch_Insert.java
 ├── CallableStatementInsert.java
 ├── Delete.java
 ├── Insert.java
 ├── PreparedDelete.java
 ├── PreparedInsert.java
 ├── PreparedStatementDisplay.java
 ├── PreparedUpdate.java
 ├── StatementDisplay.java
 └── Update.java

🛠️ Technologies Used

Java (JDK 8 or above)

JDBC API

MySQL Database (or any JDBC-supported database)

IntelliJ IDEA / Eclipse (Recommended IDE)

⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/nikhilgandule/JDBC.git
cd JDBC

2️⃣ Configure Database

Create a database and table in MySQL:

CREATE DATABASE jdbc_db;

USE jdbc_db;

CREATE TABLE student(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

3️⃣ Add JDBC Driver

Download MySQL Connector/J and add it to your project:

mysql-connector-j.jar


Add it to:

IntelliJ IDEA → Project Structure → Libraries

Eclipse → Build Path → Add External JAR

🔧 Configuration

Update database credentials inside Java files:

String url = "jdbc:mysql://localhost:3306/jdbc_db";
String user = "root";
String password = "your_password";


Make sure:

MySQL server is running

Database name matches your code

▶️ Usage Examples

🔹 Insert Data
Run Insert.java


Adds new records to the database.

🔹 Update Records
Run Update.java


Updates existing values using SQL queries.

🔹 Display Records
Run StatementDisplay.java


Fetches and prints table data.

🔹 PreparedStatement Example
Run PreparedInsert.java


Uses parameterized queries to prevent SQL Injection.

🔹 CallableStatement Example
Run CallableStatementInsert.java


Executes stored procedures from Java.

📦 Dependencies

Java Development Kit (JDK 8+)

MySQL Connector/J (JDBC Driver)

MySQL Server

🤝 Contributing

Contributions are welcome! If you'd like to improve this project:

Fork the repository

Create a new branch

git checkout -b feature-name


Commit your changes

Push and create a Pull Request

Please ensure your code is clean and well-documented.

📜 License

This project is open-source and available under the MIT License.
You are free to use, modify, and distribute it with proper attribution.

👨‍💻 Author

Nikhil Gandule
Kartik Jadhav 
Shruti Tarade

Aspiring Java Full Stack Developer
