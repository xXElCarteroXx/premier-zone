# ⚽ Premier Zone API

A backend REST API built with **Spring Boot** and **PostgreSQL** that manages player records for the English Premier League.  
This project is the backend foundation for a future full-stack web application that will track and manage player stats and profiles.
**NOTE:** this project was done by following Erik Cupsa's version of the app for learning purposes

---

## 🧠 Overview

The **Premier Zone API** allows users to retrieve and manage a registry of Premier League soccer players.  
Currently, it supports fetching all registered players and deleting players by name.  

Future updates will include:
- Player creation and updating.
- Team and match statistics endpoints.
- Integration with a React frontend.

---

## ⚙️ Tech Stack

- ☕ **Java 17**
- 🧩 **Spring Boot 3.x**
- 🌐 **Spring Web**
- 🗄️ **Spring Data JPA**
- 💾 **PostgreSQL**
- 🔗 **JDBC API**
- 🧰 **CycloneDX SBOM Support**

---

## 🧩 Features

- Retrieve a list of all Premier League players.  
- Delete a player by name.  
- Persistent storage in PostgreSQL using JPA repositories.  
- Ready for extension into a full-stack soccer management application.  

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/yourusername/premier-zone.git
cd premier-zone
```
### 2️⃣ Configure PostgreSQL database

Create a PostgreSQL database named premier-zone-db (or any name you prefer)
Then, update your credentials in **src/main/resources/application.properties**
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/premier_zone_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Run the application
```bash

mvn spring-boot:run
```

### 4️⃣ Test the API
 **Base URL:** http://localhost:8080/api/v1/player

## Example endpoints:
- GET → /api/v1/player (Retrieve all premier league players)
- DELETE → api/v1/{playerName} (Delete a player by its name)
Example for deletion: DELETE http://localhost:8080/api/v1/player/Mohamed%20Salah

