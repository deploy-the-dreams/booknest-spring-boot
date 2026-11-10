🤝 Contributing

This is a collaborative learning and development project under Deploy the Dreams.

We welcome developers who are interested in learning, sharing knowledge, solving problems, and building real-world applications.

How to Contribute

📌 How to Contribute

1. Check GitHub Issues and understand the day’s tasks.
2. Pull the latest boilerplate code from BOILERPLATE BRANCH e.g. DAY00-BOILERPLATE.
3. Create your branch: DAY00-YOUR-NAME. (No boilerplate in the name).
4. Implement the tasks yourself. No vibe coding!
5. Test, commit and push your changes.
6. Raise a PR referencing the corresponding Issue.

Need help? Check the Direct Code / Reference Implementation or ask the community.

Focus on learning, understanding and building together!

Learn Together. Build Together. Deploy Together. 🚀

Please maintain clean code, follow established project conventions, and document significant changes.

⸻

🌱 About Deploy the Dreams

Deploy the Dreams is a developer community built around one simple belief:

Learning becomes more meaningful when we build together.

We aim to create an environment where developers can:

* Learn new technologies.
* Work on practical projects.
* Share knowledge and experiences.
* Collaborate with other developers.
* Turn ideas into real products.

Learn Together. Build Together. Deploy Together.

⸻

📌 Project Status

🚧 Currently in Development

This project is actively evolving. Features, architecture, and documentation will be updated as development progresses.

⸻

📚 Book Rental System

A collaborative Java Spring Boot project by Deploy the Dreams.

The Book Rental System is a web-based application designed to simplify book rental and library management. It aims to provide a platform where users can explore books, rent available titles, manage their rentals, and track their rental history.

This project is being developed collaboratively as part of the Deploy the Dreams initiative, where developers learn, build, collaborate, and deploy real-world applications together.

⸻

🎯 Project Vision

Our goal is not just to build another CRUD application. We want to develop a practical, scalable application that demonstrates real-world software engineering concepts.

Through this project, contributors will get hands-on experience with:

* Java and Spring Boot development.
* REST API design and development.
* Database design and management.
* Authentication and authorization.
* Application architecture and best practices.
* Git, GitHub, and collaborative development.
* Testing, deployment, and maintenance.

⸻

✨ Planned Features

👤 User Management

* User registration and login.
* User profile management.
* Role-based access control.

📖 Book Management

* Browse available books.
* Search books by title, author, or category.
* View book details.
* Manage book inventory.

🔄 Rental Management

* Rent available books.
* Track active rentals.
* Manage rental history.
* Return rented books.
* Track rental due dates.

🛠️ Admin Management

* Manage books and categories.
* Manage registered users.
* Monitor rental transactions.
* Track book availability.

⸻

🧰 Technology Stack

Technology	Purpose
Java 21	Backend programming language
Spring Boot	Backend application framework
Spring Data JPA	Database operations
Spring Security	Authentication and authorization
MySQL	Relational database
Maven	Dependency and build management
REST API	Client-server communication
Swagger / OpenAPI	API documentation
JUnit	Unit testing

The technology stack and implementation details may evolve during development.

⸻

🏗️ Project Architecture

We intend to follow a layered architecture to maintain separation of concerns and make the application easier to maintain and extend.

book-rental-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/deploythedreams/bookrental/
│   │   │       ├── config/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── entity/
│   │   │       ├── exception/
│   │   │       ├── repository/
│   │   │       ├── security/
│   │   │       ├── service/
│   │   │       └── BookRentalApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── docs/
├── .gitignore
├── pom.xml
└── README.md

⸻

🚀 Getting Started

Prerequisites

Make sure you have installed:

* Java JDK 21
* Maven
* MySQL 8+
* Git
* An IDE (IntelliJ IDEA / Eclipse / VS Code)

Clone the Repository

git clone <repository-url>

Navigate to the Project

cd book-rental-system

Configure Database

Create a MySQL database:

CREATE DATABASE book_rental_db;

Configure your database credentials in application.properties.

Run the Application

mvn spring-boot:run

The application will be available at:

http://localhost:8080

⸻

🗺️ Development Roadmap

We plan to develop this application incrementally.

* Project initialization and configuration.
* Database design and entity creation.
* Book management APIs.
* User registration and authentication.
* Role-based authorization.
* Book rental functionality.
* Book return functionality.
* Rental history and tracking.
* Admin dashboard APIs.
* Unit and integration testing.
* API documentation.
* Deployment.

⸻

Built with curiosity, collaboration, and a passion for software development.

A Deploy the Dreams initiative.
