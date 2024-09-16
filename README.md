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
