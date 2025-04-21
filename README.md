# Spring Boot REST API - Course Management

This is a simple RESTful API built using **Spring Boot**, **Spring Data JPA**, and **H2 In-Memory Database**.  
It demonstrates basic CRUD operations on Course data (Create, Read, Update, Delete).

---

##  Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

##  Features
- Get all courses
- Get course by ID
- Add a new course
- Update a course
- Delete a course

---

##  API Endpoints

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| GET    | `/courses`       | Get all courses      |
| GET    | `/courses/{id}`  | Get course by ID     |
| POST   | `/courses`       | Create a new course  |
| PUT    | `/courses/{id}`  | Update a course      |
| DELETE | `/courses/{id}`  | Delete a course      |

---

##  H2 Database Console

You can access the in-memory H2 database at:http://localhost:8080/h2-console


**Default credentials:**
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: empty

---

##  How to Run the Project

1. Clone the repo:
```bash
git clone https://github.com/YOUR_USERNAME/Spring-Boot_Rest-API.git
Open the project in IntelliJ or VS Code.

Run the app:
The API will be available at:http://localhost:8080


