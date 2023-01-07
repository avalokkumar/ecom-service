# Customer Registration Service

A simple customer registration service written in Java using Spring Boot and Gradle.

## Requirements

- Java 8 or higher
- Gradle 6.5.1 or higher

## Getting Started

To get started with the service, clone the repository and build the project using Gradle:

```bash
git clone https://github.com/avalokkumar/ecom-customer-registration-service.git
cd customer-registration-service
gradle build


To run the service, use the gradle bootRun command. This will start the service on port 8080.

API
The service exposes the following API:

POST /customers
Creates a new customer.

### Request Body

{
  "name": "John Doe",
  "email": "john.doe@example.com"
}

### Response

{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}


```

