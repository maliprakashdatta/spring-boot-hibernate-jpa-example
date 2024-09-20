# spring-boot-hibernate-jpa-example

### Technical Details
In this project, we are going to use below set of versions for demonstrations.

    Spring Boot - 3.3.3
    Lombok - 1.18.34
    mysql-8.0.28
    starter-web-3.3.2

### Building

The example can be built with
```shell
mvn clean install
```

### Running the example in your local
```shell
mvn clean spring-boot:run
```

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

# /customer 
# customer POST method
```shell
curl --location 'http://localhost:8083/customerManagement/customer' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":2,
   "firstName":"Purva",
   "lastName":"patil",
    "email":"purvap@gmail.com"
} '
```
# customer POST Screen 

<image src="https://github.com/user-attachments/assets/894136c1-cbd1-4670-9082-635399100df3" width="750" height="350">

# customer GET method
```shell
curl --location --request GET 'http://localhost:8083/customerManagement/customer/2' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":2,
   "firstName":"Purva",
   "lastName":"patil",
    "email":"purvap@gmail.com"
}
    '
```
# customer GET Screen 

<image src="https://github.com/user-attachments/assets/c18eb804-71e4-4846-a292-0352c096b933" width="750" height="350">

# mysql customerdb
create  Schemas customerdb
```shell
CREATE SCHEMA `customerdb` ;
```
# customer mysql customerdb Screen Output

<image src="https://github.com/user-attachments/assets/e740d5d7-64da-416d-86a2-07d285f67b17" width="750" height="350">


