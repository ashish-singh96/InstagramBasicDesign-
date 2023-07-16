

# Instagram Backend

This project aims to develop the backend functionality for an Instagram-like application. It provides APIs for user authentication, user management, and post management.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Installation](#installation)
  - [Configuration](#configuration)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- RESTful API
- Maven/Gradle
- PostgreSQL/MySQL (or any other supported database)


### Configuration

1. Open the project in your preferred IDE.

2. Configure the database connection details in the `application.properties` file.

3. Build the project to install the required dependencies.

### Running the Application

1. Run the application using your IDE or using the command:

   ```bash
   mvn spring-boot:run
   ```

2. The application will start running on `http://localhost:8080`.

## API Endpoints

### User Endpoints

- **Sign In**: `POST /users/signin`
  - Request body:
    ```json
    {
      "email": "user@example.com",
      "password": "password123"
    }
    ```
  - Response:
    ```json
    {
      "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    }
    ```

- **Sign Up**: `POST /users/signup`
  - Request body:
    ```json
    {
      "firstName": "John",
      "lastName": "Doe",
      "age": 25,
      "email": "user@example.com",
      "phoneNumber": "1234567890",
      "password": "password123"
    }
    ```
  - Response:
    ```json
    {
      "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    }
    ```

- **Update User Details**: `PUT /users/{userId}`
  - Request body:
    ```json
    {
      "firstName": "Updated First Name",
      "lastName": "Updated Last Name",
      "age": 30,
      "email": "updated@example.com",
      "phoneNumber": "9876543210"
    }
    ```
  - Response:
    ```json
    {
      "firstName": "Updated First Name",
      "lastName": "Updated Last Name",
      "age": 30,
      "email": "updated@example.com",
      "phoneNumber": "9876543210"
    }
    ```

### Post Endpoints

- **Save Post**: `POST /posts`
  - Request body:
    ```json
    {
      "postData": "This is a sample post.",
      "userId": 1
    }
    ```
  - Response:
    ```json
    {
      "postId": 1,
      "createdDate": "2023-07-16T12:34:56Z",
      "updatedDate": "2023-07-16T12:34:56Z",
      "postData": "This is a sample post.",
      "user": {
        "userId": 1,
        "firstName": "John",
        "lastName": "Doe",
        "age": 25,
        "email": "user@example.com",
        "phoneNumber": "1234567890"
      }
    }
    ```

- **Get Post**: `GET /posts/{postId}`
  - Response:
    ```json
    {
      "postId": 1,
      "createdDate": "2023-07-16T12:34:56Z",
      "updatedDate": "2023-07-16T12:34:56Z",
      "postData": "This is a sample post.",
      "user": {
        "userId": 1,
        "firstName": "John",
        "lastName": "Doe",
        "age": 25,
        "email": "user@example.com",
        "phoneNumber": "1234567890"
      }
    }
    ```

