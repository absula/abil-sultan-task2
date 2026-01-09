Task 2 – Spring Boot REST API

This project is a simple REST API created using Spring Boot as part of Task 2.

The application works only as a backend and does not contain any frontend.
It allows basic operations on products using HTTP requests and JSON format.

About the project
The application manages products.
Each product has an id and a name.

The code is divided into separate layers:
	•	controller – handles HTTP requests
	•	service – contains application logic
	•	repository – stores data
	•	request and response classes – used to send and receive JSON data
	•	mapper – converts objects between layers

This structure makes the application easier to understand and modify.

Available endpoints
The following endpoints are implemented:

POST /api/v1/products Creates a new product.

GET /api/v1/products Returns all products.

GET /api/v1/products/{id} Returns a product with the given id.

PUT /api/v1/products/{id} Updates an existing product.

DELETE /api/v1/products/{id} Deletes a product.

Data storage
For simplicity, the application uses in-memory storage based on a HashMap.
Data exists only while the application is running and is removed after restart.

Testing
All endpoints were tested using Postman.
Requests were sent in JSON format and responses were checked using HTTP status codes.

Summary
This project shows basic understanding of REST APIs, Spring Boot structure
and CRUD operations.
Screenshots:
<img width="1012" height="760" alt="Снимок экрана 2026-01-09 в 05 11 28" src="https://github.com/user-attachments/assets/910c7b51-25d7-48a3-bfc3-e8d199be784e" />
<img width="1009" height="707" alt="Снимок экрана 2026-01-09 в 05 12 44" src="https://github.com/user-attachments/assets/3cb707c6-7430-4586-a007-2cdde3a1f501" />
<img width="1007" height="723" alt="Снимок экрана 2026-01-09 в 05 11 58" src="https://github.com/user-attachments/assets/205f115a-1080-441f-9674-caf3edd5f583" />
<img width="1010" height="741" alt="Снимок экрана 2026-01-09 в 05 12 16" src="https://github.com/user-attachments/assets/12f26f21-d075-478c-95a7-554b839a5b51" />

