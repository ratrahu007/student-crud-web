# 🎓 Student CRUD App — Spring Boot + MySQL + JPA

A simple and clean Student Management CRUD application built with **Spring Boot**, **MySQL**, **JPA**, and **DTOs**. It supports full Create, Read, Update, and Delete operations via REST APIs, with proper input validation using `@Valid`.

---

## 🚀 Features

- ✅ Add, update, delete, and list students  
- 📦 Uses DTOs (`StudentRequest`, `StudentResponse`) for clean data flow  
- 🔐 Input validation using `@Valid`  
- 🛠️ MySQL + Spring Data JPA integration  
- 🔄 RESTful API structure  
- 🧼 Clean architecture (Controller → Service → Repository)

---

## 🧰 Tech Stack

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Jakarta Validation  
- Maven

---

## 📁 Project Structure

student-crud-app/
├── controller/
│ └── StudentController.java
├── service/
│ ├── StudentService.java
│ └── StudentServiceImpl.java
├── dto/
│ ├── StudentRequest.java
│ └── StudentResponse.java
├── entity/
│ └── Student.java
├── repository/
│ └── StudentRepository.java
├── resources/
│ └── application.properties
└── StudentCrudApplication.java


---

## 🌐 API Endpoints

| Method | Endpoint          | Description        |
|--------|-------------------|--------------------|
| GET    | `/students`       | Get all students   |
| GET    | `/students/{id}`  | Get student by ID  |
| POST   | `/students`       | Add new student    |
| PUT    | `/students/{id}`  | Update student     |
| DELETE | `/students/{id}`  | Delete student     |

---

## ⚙️ How to Run

### 1️⃣ Create MySQL Database

CREATE DATABASE studentdb;


spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

./mvnw spring-boot:run



👤 Author
Made with ❤️ by Rahul Rathod


