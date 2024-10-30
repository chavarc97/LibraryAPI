# BOOK LIBRARY API

## Description
This is a simple API for a book library. It allows you to create, read, update and delete books from the library.

## Installation
1. Clone the repository
2. Add application.properties file in src/main/resources folder with the following content:
```
spring.data.mongodb.uri= <MONGODB_URI>
spring.data.mongodb.database= <DATABASE_NAME>
```

## Usage
1. Run the application
2. Use Postman or any other API testing tool to test the API
3. The API has the following endpoints:
    - GET /books: Get all books
    - GET /books/{title}: Get a book by title
    - POST /books: Create a new book
    - PUT /books/{id}: Update a book by id
    - DELETE /books/{id}: Delete a book by id
4. If using a frontend use port 3000 to run the frontend application

## Technologies
- [SpringBoot](https://spring.io/projects/spring-boot)
- [MongoDB](https://www.mongodb.com/)
- [Postman](https://www.postman.com/)
- [Maven](https://maven.apache.org/)
- [Java](https://www.java.com/)