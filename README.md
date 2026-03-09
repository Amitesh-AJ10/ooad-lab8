# Student Management System

A Spring Boot application using **MVC Architecture** for student registration and management.

## Tech Stack
- **Backend:** Spring Boot, Hibernate (JPA)
- **Database:** MySQL
- **Frontend:** Thymeleaf (HTML/CSS)
- **Java Version:** 21

## Setup
1. **Database:** Create the schema in MySQL:
   ```sql
   CREATE DATABASE student_db;
   ```
2. **Config:** Copy `application.properties.example` to `application.properties` and add your MySQL password.

## How to Run
In the project root, run:
```bash
./mvnw spring-boot:run
```
Access the app at: **http://localhost:8080**

## Features
- **Registration:** Form to add Name, Email, and Course.
- **Student List:** Real-time table display of database records.
- **Validation:** Prevents duplicate email entries.
- **Persistence:** Full CRUD support via JPA/Hibernate.
