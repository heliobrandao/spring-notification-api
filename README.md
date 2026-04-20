# spring-notification-api

Java Spring Boot project demonstrating Interfaces, Dependency Injection and Strategy Pattern through a notification API.

## 📌 Overview

This project was created to practice backend development with Java and Spring Boot using clean architecture concepts.

The API simulates a notification system capable of sending messages through different channels such as:

* Email
* SMS
* WhatsApp

Each channel is implemented through interfaces, allowing low coupling and easy scalability.

---

## 🚀 Technologies

* Java 17
* Spring Boot
* Maven
* Spring Web
* Lombok
* Bean Validation

---

## 🧠 Concepts Practiced

* Interfaces
* Dependency Injection
* SOLID Principles
* Strategy Pattern
* REST API Development
* Layered Architecture

---

## 📂 Project Structure

```text
src/main/java/com/heliobrandao/notification

controller/
service/
service/impl/
dto/
factory/
```

---

## 🔥 Main Endpoint

### Send Notification

```http
POST /notify
```

### Example Request

```json
{
  "type": "email",
  "message": "Hello customer!"
}
```

### Supported Types

* email
* sms
* whatsapp

---

## 🎯 Learning Goal

Build a practical project to improve Java backend skills and demonstrate professional Spring Boot architecture concepts.

---

## 📌 Future Improvements

* Save notification history in database
* Unit tests with JUnit and Mockito
* Docker support
* Authentication with Spring Security
* Queue processing with RabbitMQ

---

## 👨‍💻 Author

Helio Brandao
