# Loan Challenge Project 💰

This project is a **Loan Management System** developed as part of a technical challenge. It was built using **Java Spring** and follows **best programming practices** such as clean code, SOLID principles, and RESTful API design.

## About the Project 🚀

The goal of this project is to provide a simple and efficient system for managing loan requests. It includes features like:

- Loan request creation.
- Validation of loan eligibility based on predefined rules.
- RESTful API endpoints for interaction.

## Technologies Used 🛠️

- **Backend:** Java Spring Boot
- **Database:** In memory
- **Tools:** Maven, Git, Postman (for API testing)
- **Best Practices:** Clean Code, SOLID Principles, RESTful API Design

## Features ✨

- **Loan Request:** Users can submit loan requests with necessary details.
- **Eligibility Check:** The system validates loan requests based on predefined rules.
- **API Endpoints:** Well-documented RESTful APIs for seamless integration.

## How to Run the Project ▶️

1. Clone the repository:
   ```bash
   git clone https://github.com/lucasmunizz/loans.git
2. Navigate to the project directory:
   ```bash
   cd loans
3. Build the project using Maven:
   ```bash
    mvn clean install
4. Run the application:
   ```bash
   mvn spring-boot:run
5. Access the API endpoints via http://localhost:8080.

## Accessing the API Documentation 📄

The API documentation is automatically generated using **Swagger**. You can access it after running the application.

### Steps to Access Swagger UI:

1. **Run the application** (if not already running):
   ```bash
   mvn spring-boot:run

2. **Open your browser and go to the following URL**:
   http://localhost:8080/swagger-ui.html

## Example Request

**[POST]** `{{host}}/customer-loans`

```json
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Lucas Muniz",
    "income": 5000.00,
    "location": "SP"
}
```

## Example Response

```
HTTP/1.1 200 Ok
```

```json
{
    "customer": "Lucas Muniz",
    "loans": [
        {
            "type": "PERSONAL",
            "interest_rate": 4
        },
        {
            "type": "GUARANTEED",
            "interest_rate": 3
        },
        {
            "type": "CONSIGNMENT",
            "interest_rate": 2
        }
    ]
}
```

