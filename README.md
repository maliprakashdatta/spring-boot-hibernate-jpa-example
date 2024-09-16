# spring-boot-hibernate-jpa-example

## Spring Boot Hibernate JPA Example
This is a simple Spring Boot application demonstrating how to use Hibernate with Spring Data JPA. It includes REST endpoints for managing User entities in an in-memory mysql/H2 database.

### Features
#### Spring Boot: A framework to create production-ready applications in minimal time.<br>
#### Hibernate: A widely used ORM (Object-Relational Mapping) framework.<br>
#### Spring Data JPA: Abstraction over JPA to simplify data access layers.<br>
#### MySql Database:In-memory database for using  purposes.<br>
#### H2 Database: In-memory database for testing purposes.<br>
#### Lombok: Reduces boilerplate code (like getters, setters, and constructors).

# Project Structure

```shell
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── controller    # REST Controllers
│   │   │           ├── entity        # JPA Entities
│   │   │           ├── repository    # Repositories (DAO Layer)
│   │   │           ├── service       # Service Layer
│   │   │           └── SpringBootHibernateJpaApplication.java   # Main application class
│   │   └── resources
│   │       ├── application.properties  # Application configuration
│   │       └── static                  # Static resources
│   └── test                            # Unit and integration tests
└── pom.xml                              # Maven configuration

```

# Prerequisites
Make sure you have the following installed:

JDK 17 or later<br>
Maven 3.8.1 or later


Here’s a sample README.md file for your Spring Boot, Hibernate, and JPA application:

Spring Boot Hibernate JPA Example
This is a simple Spring Boot application demonstrating how to use Hibernate with Spring Data JPA. It includes REST endpoints for managing User entities in an in-memory H2 database.

Features
Spring Boot: A framework to create production-ready applications in minimal time.
Hibernate: A widely used ORM (Object-Relational Mapping) framework.
Spring Data JPA: Abstraction over JPA to simplify data access layers.
H2 Database: In-memory database for testing purposes.
Lombok: Reduces boilerplate code (like getters, setters, and constructors).
Project Structure
bash
Copy code
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── controller    # REST Controllers
│   │   │           ├── entity        # JPA Entities
│   │   │           ├── repository    # Repositories (DAO Layer)
│   │   │           ├── service       # Service Layer
│   │   │           └── SpringBootHibernateJpaApplication.java   # Main application class
│   │   └── resources
│   │       ├── application.properties  # Application configuration
│   │       └── static                  # Static resources
│   └── test                            # Unit and integration tests
└── pom.xml                              # Maven configuration

# Prerequisites
Make sure you have the following installed:

JDK 17 or later
Maven 3.8.1 or later


Getting Started
1. Clone the Repository
bash
Copy code
git clone https://github.com/your-repo/spring-boot-hibernate-jpa-example.git
cd spring-boot-hibernate-jpa-example
2. Build and Run the Application
bash
Copy code
# Build the application
mvn clean install

# Run the application
mvn spring-boot:run
3. Access the H2 Database Console
By default, the H2 database console is enabled. You can access it at:

bash
Copy code
http://localhost:8080/h2-console
Use the following credentials:

JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: password
4. API Endpoints
The application provides the following RESTful endpoints to manage User entities:

Method	URL	Description
GET	/users	Get all users
GET	/users/{id}	Get user by ID
POST	/users	Create a new user
DELETE	/users/{id}	Delete user by ID
