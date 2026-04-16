# 🏨 LakeSide Hotel Booking System – Backend

Spring Boot backend service powering the LakeSide Hotel Booking platform.  
Provides REST APIs for room management, bookings, and authentication.

---

## 🚀 Features

- 🔐 JWT-based Authentication & Authorization
- 🛏 Room Management APIs
- 📅 Booking System
- 👤 User Management
- 🌐 CORS Configuration for frontend integration
- ⚙️ Layered Architecture (Controller → Service → Repository)

---

## 🏗️ Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- Maven
- (Add DB here: MySQL / MongoDB if used)

---

## 📂 Project Structure

```bash

src/main/java/com/aseem/lakesidehotel
├── controller # REST Controllers
├── service # Business Logic
├── repository # Data Access Layer
├── model # Entities
├── request # Request DTOs
├── response # Response DTOs
├── security # JWT + Security Config
├── exception # Global Exception Handling
│
└── LakeSideHotelApplication.java  # Main entry point

```
---

## 🔌 API Endpoints (Sample)

### 🔐 Auth
- POST `/auth/login`
- POST `/auth/register`

### 🛏 Rooms
- GET `/rooms`
- POST `/rooms`

### 📅 Bookings
- POST `/bookings`
- GET `/bookings/user/{id}`

---

## ⚙️ How to Run

```bash
# Clone repo
git clone https://github.com/aseemjan/LakeSideHotel-Service.git

# Navigate
cd LakeSideHotel-Service

# Run
./mvnw spring-boot:run

```

🔗 Frontend Repository
👉 LakeSideHotel-Client - https://github.com/aseemjan/LakeSideHotel-Client