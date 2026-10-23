# Java JDBC Database Management Project

A console-based Java application that connects to an Oracle Database using JDBC and performs basic database operations.

## 📌 Project Overview

This project demonstrates how to connect a Java application to an Oracle Database and manage records using SQL queries. It uses a menu-driven console interface to allow users to insert, delete, search, and view employee records.

## 🚀 Features

- **Insert Records:** Add new employee records to the database.
- **Delete Records:** Delete existing records.
- **Search Records:** Search for an employee using their ID.
- **View All Records:** Retrieve and display all employee records.
- **JDBC Connectivity:** Connect Java to Oracle Database.
- **PreparedStatement:** Execute parameterized SQL queries.
- **Exception Handling:** Handle errors and allow the program to continue where appropriate.
- **Resource Management:** Close database resources using try-with-resources.
- **Environment Variables:** Store database connection details outside the source code.
- **GitHub:** Manage and share project source code using version control.

## 🛠️ Technologies Used

- Java Standard Edition (Java SE)
- JDBC (Java Database Connectivity)
- Oracle Database
- SQL
- Eclipse IDE
- Git and GitHub

## ⚠️ Exception Handling

The project covers handling different types of errors:

- `SQLException` — Handles database connection and SQL execution errors.
- `SQLIntegrityConstraintViolationException` — Handles database integrity constraint violations, such as duplicate primary keys.
- `NumberFormatException` — Handles invalid numeric conversions.
- `InputMismatchException` — Handles unexpected input types when using methods such as `Scanner.nextInt()`.
- `ClassNotFoundException` — Handles a missing JDBC driver class when explicitly loading the driver using `Class.forName()`.

*Note: The exceptions listed above should match the exceptions actually handled in the source code.*

## 🔐 Environment Variables

Database connection details are read from environment variables rather than being hardcoded into the Java source code.

Configure these variables on your computer:

- `jdbc_url` — Oracle JDBC connection URL
- `jdbc_username` — Oracle database username
- `jdbc_password` — Oracle database password

The application can read these values using Java's `System.getenv()` method.

**Security note:** Never upload real database credentials to GitHub.

## 🗄️ Database Operations

The application performs the following operations on an employee table:

1. Insert a new employee record.
2. Delete an employee record.
3. Search for an employee by ID.
4. Display all employee records.

The database table and column names must match those used in the Java source code.

## ▶️ How to Run the Project

1. Install the Java Development Kit (JDK).
2. Install Eclipse IDE or another Java IDE.
3. Install and configure Oracle Database.
4. Add the appropriate Oracle JDBC driver to the project's classpath.
5. Create the required database table.
6. Configure the database connection environment variables.
7. Open the project in Eclipse.
8. Run the Java class as a Java Application.
9. Follow the console menu to perform database operations.

## 📚 What I Learned

Through this project, I gained practical experience in:

- Java programming and control flow.
- JDBC database connectivity.
- SQL CRUD operations.
- Using `PreparedStatement` and `ResultSet`.
- Exception handling and input validation.
- Managing database resources.
- Using environment variables to protect credentials.
- Uploading source code to GitHub.


## 🎯 Future Improvements

- Add an update-record feature.
- Improve input validation.
- Add logging and clearer error messages.
- Improve the user interface.

---

**Author:** Charan

*This project was developed as a hands-on learning exercise to strengthen my Java and database programming skills.*
