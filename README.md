# 🚀 Spring Boot CRUD Application

This is a simple **CRUD (Create, Read, Update, Delete)** application built using **Spring Boot** and **MySQL**, developed as part of backend learning and practice.

---

## 🛠️ Tech Stack Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Eclipse IDE

---

## 📌 Features

- ✅ Add new records
- ✅ View all records
- ✅ Update existing records
- ✅ Delete records
- ✅ RESTful API architecture
- ✅ Layered code structure (Controller → Service → Repository)

---

## 🎯 API Endpoints

| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| GET    | `/students`        | Get all students    |
| GET    | `/students/{id}`   | Get student by ID   |
| POST   | `/students`        | Create new student  |
| PUT    | `/students/{id}`   | Update student info |
| DELETE | `/students/{id}`   | Delete student      |

---

## 🧑‍💻 How to Run the Project

1. Clone the repository:
   https://github.com/priyanshu-234/SpringbootCrudOperation

   
2. Import the project in **Eclipse** as a **Maven Project**

3. Configure the database in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Start your MySQL server and create a database (e.g., studentdb)

Run the application:

Run CrudApplication.java as Java Application

Use Postman or any REST client to test the APIs.

src/
├── controller/
├── model/
├── repository/
├── service/
├── exception/  (optional)
└── application.properties

src/
├── controller/
├── model/
├── repository/
├── service/
├── exception/  (optional)
└── application.properties

Project Demo Video

A short video demo will be available soon showing how this Spring Boot CRUD application works from start to finish.

🔜 *Video link will be added here after uploading.*

<!--
📺 Watch Demo:
🔗 https://drive.google.com/file/d/1ECQtVeY58P-rcVoJsWuuLcwMTxti5SLs/view?usp=drive_link
-->

