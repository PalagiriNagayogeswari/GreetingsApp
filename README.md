# Greetings App

A simple Spring MVC web application that demonstrates how to build a RESTful Greetings API using **Spring MVC, JdbcTemplate, DataSoruce and PostgreSQL**.

The application allows users to create and retrieve greeting messages through REST API endpoints. It follows a layered architecture by separating the Controller, Service, and DAO layers.

## Features

* Create a new greeting message
* Retrieve all greeting messages
* Retrieve a greeting by ID
* RESTful API implementation
* Database integration using `JdbcTemplate`
* PostgreSQL database support
* Layered architecture
* Exception handling
* JSON request and response handling
* Spring MVC configuration
* Maven-based project

## Technologies Used

* **Java**
* **Spring MVC**
* **Spring JDBC**
* **JdbcTemplate**
* **PostgreSQL**
* **Apache Tomcat**
* **Maven**
* **REST API**
* **JSON**
* **Git & GitHub**

## Project Architecture

```text
GreetingsApp
│
├── src
│   └── main
│       ├── java
│       │   └── com.example
│       │       ├── controller
│       │       ├── service
│       │       ├── dao
│       │       ├── model
│       │       └── config
│       │
│       ├── resources
│       │   └── application.properties
│       │
│       └── webapp
│           └── WEB-INF
│               └── web.xml
│
├── pom.xml
└── README.md
```

## Application Flow

```text
Client
   ↓
HTTP Request
   ↓
Controller
   ↓
Service
   ↓
DAO
   ↓
JdbcTemplate
   ↓
PostgreSQL Database
   ↓
DAO
   ↓
Service
   ↓
Controller
   ↓
JSON Response
```

### Layer Responsibilities

**Controller**

Handles HTTP requests and sends appropriate HTTP responses.

**Service**

Contains the application's business logic and communicates between the Controller and DAO layers.

**DAO**

Responsible for database operations using `JdbcTemplate`.

**Model**

Represents the application's data objects.

## REST API Endpoints

### Create Greeting

```http
POST /greetings
```

Example request:

```json
{
    "message": "Hello, World!"
}
```

Example response:

```json
{
    "id": 1,
    "message": "Hello, World!"
}
```

### Get All Greetings

```http
GET /greetings
```

Example response:

```json
[
    {
        "id": 1,
        "message": "Hello, World!"
    },
    {
        "id": 2,
        "message": "Good Morning!"
    }
]
```

### Get Greeting By ID

```http
GET /greetings/{id}
```

Example:

```http
GET /greetings/1
```

Example response:

```json
{
    "id": 1,
    "message": "Hello, World!"
}
```

## Database

The application uses **PostgreSQL** as the database and **Spring JdbcTemplate** for executing SQL queries.

Example table:

```sql
CREATE TABLE greetings (
    id SERIAL PRIMARY KEY,
    message VARCHAR(255) NOT NULL
);
```

## Configuration

Configure the PostgreSQL database connection in the application's configuration file.

Example:

```properties
db.url=jdbc:postgresql://localhost:5432/greetingsdb
db.username=postgres
db.password=your_password
db.driver=org.postgresql.Driver
```

> Update the database name, username, and password according to your local PostgreSQL setup.

## Maven Dependencies

The project uses Maven to manage dependencies.

Important dependencies include:

* Spring MVC
* Spring JDBC
* PostgreSQL JDBC Driver
* Jackson
* Servlet API

Run the following command to build the project:

```bash
mvn clean install
```

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/PalagiriNagayogeswari/GreetingsApp.git
```

### 2. Open the project

Open the project in an IDE such as:

* IntelliJ IDEA
* Eclipse
* Spring Tool Suite

### 3. Configure PostgreSQL

Create the database and required table.

### 4. Update database configuration

Configure the PostgreSQL URL, username, and password.

### 5. Build the project

```bash
mvn clean install
```

### 6. Deploy the WAR file

Deploy the generated WAR file to an Apache Tomcat server.

### 7. Test the APIs

Use **Postman** or another REST client to test the available endpoints.

## 🧪 Testing

The REST APIs can be tested using Postman.

Example:

```text
POST   /greetings
GET    /greetings
GET    /greetings/{id}
```

## Concepts Demonstrated

This project demonstrates practical implementation of:

* Spring MVC
* REST API development
* Dependency Injection
* IoC Container
* Layered Architecture
* Controller-Service-DAO pattern
* JdbcTemplate
* SQL queries
* PostgreSQL connectivity
* ResultSet mapping
* Exception handling
* JSON serialization
* Maven
* WAR deployment
* Apache Tomcat

## Author

**Palagiri Nagayogeswari**

GitHub: [PalagiriNagayogeswari](https://github.com/PalagiriNagayogeswari)


This project is created for learning and educational purposes.
