# Backend_Traini8_Akshay

## 🚀 Tech Stack
- **Java**
- **Spring Boot**
- **Maven**

## 📂 Project Structure
```
src/main/java/com/assignment/traini8/
├── controller/    # REST controllers
├── dto/           # Data Transfer Objects
├── exception/     # Global exception handler
├── model/         # Entity classes
├── repository/    # Repository interfaces
├── service/       # Service classes
```

## 🔧 Prerequisites
- Java **17** or higher
- Maven **3.6.0** or higher

## 📥 How to Clone the Repository
```sh
git clone https://github.com/AkkyAv/Backend_Traini8_Akshay.git
cd Backend_Traini8_Akshay
mvn clean install
mvn spring-boot:run
```
The application will start on **[http://localhost:8080](http://localhost:8080)**.

---

## 📌 API Endpoints

### 1️⃣ Create Training Center
**URL:** `/api/training-center`  
**Method:** `POST`  
**Request Body:**
```json
{
  "centerName": "Example Center",
  "centerCode": "EXAMPLE12345",
  "address": {
    "detailedAddress": "123 Main St",
    "city": "Example City",
    "state": "Example State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Course1", "Course2"],
  "contactPhone": "1234567890",
  "contactEmail": "example@example.com"
}
```
**Success Response:**
- **Code:** `201 CREATED`
- **Content:** Newly created Training Center details in JSON format.

**Response:**
```json
{
  "id": 1,
  "centerName": "Example Center",
  "centerCode": "EXAMPLE12345",
  "address": {
    "detailedAddress": "123 Main St",
    "city": "Example City",
    "state": "Example State",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "createdOn": "2025-03-19T21:08:06.127012Z",
  "coursesOffered": [
    "Course1",
    "Course2"
  ],
  "contactPhone": "1234567890",
  "contactEmail": "example@example.com"
}

```

### 2️⃣ Get All Training Centers
**URL:** `/api/training-center`  
**Method:** `GET`  
**Success Response:**
- **Code:** `200 OK`
- **Content:** List of all stored training center details.

**Response:**
```json
[
  {
    "id": 1,
    "centerName": "Example Center",
    "centerCode": "EXAMPLE12345",
    "address": {
      "detailedAddress": "123 Main St",
      "city": "Example City",
      "state": "Example State",
      "pincode": "123456"
    },
    "studentCapacity": 100,
    "createdOn": "2025-03-19T21:08:06.127012Z",
    "coursesOffered": [
      "Course1",
      "Course2"
    ],
    "contactPhone": "1234567890",
    "contactEmail": "example@example.com"
  }
]
```

---

## 🛠️ Testing Instructions
You can test the API using tools like **Postman** or `curl`.

### 📝 Example Using Postman
#### ✅ To Create a Training Center:
1. Set the request type to **POST**.
2. Enter the URL: `http://localhost:8080/api/training-center`.
3. Select **Body**, choose **raw**, and set the type to **JSON**.
4. Paste the JSON request body and send the request.

#### 📍 To Retrieve All Training Centers:
1. Set the request type to **GET**.
2. Enter the URL: `http://localhost:8080/api/training-center` and send the request.

---

## ⚠️ Error Handling
- **400 Bad Request**: Returned for validation errors with issue details.
- **500 Internal Server Error**: Returned for unexpected errors with an error message.

---
