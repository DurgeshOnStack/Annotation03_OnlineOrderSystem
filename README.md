# 🛒 Spring Core Order Management Demo

A simple **Spring Core (IoC + Dependency Injection)** based Java application that demonstrates how to manage objects like **Customer, Product, and Order** using annotations and configuration classes.

---

## 📌 Project Overview

This project showcases:

* Spring **Annotation-based configuration**
* **Component Scanning**
* **Setter-based Dependency Injection**
* Loose coupling using Spring IoC container

The application creates and links:

* A `Customer`
* A `Product`
* An `Order` (which depends on both)

---

## 🧱 Project Structure

```
com.nit
│
├── config
│   └── AppConfig.java
│
├── sbeans
│   ├── Customer.java
│   ├── Product.java
│   └── Order.java
│
└── main
    └── TestOrder.java
```

---

## ⚙️ Technologies Used

* Java
* Spring Core (Annotations)
* Eclipse / Any Java IDE

---

## 🚀 How It Works

1. Spring container is initialized using `AnnotationConfigApplicationContext`
2. Components are auto-detected using `@ComponentScan`
3. Beans are created:

   * Customer
   * Product
   * Order
4. Dependencies are injected using `@Autowired`
5. Order object prints all details

---

## 📂 Key Files Explanation

### 🔹 Configuration Class

* Defines component scanning
*

---

### 🔹 Main Class

* Starts Spring container
* Retrieves beans and sets values
*

---

### 🔹 Customer Bean

* Holds customer details
*

---

### 🔹 Product Bean

* Holds product information
*

---

### 🔹 Order Bean

* Injects Customer & Product using Spring
*

---

## ▶️ Sample Output

```
Order [orderId=101, 
       customer=Customer [name=Pawan, email=pawan@gmail.com], 
       product=Product [productName=Laptop, price=70000.0]]
```

---

## 🧠 Key Concepts Demonstrated

* IoC Container
* Dependency Injection (Setter Injection)
* Annotation-based configuration
* Bean lifecycle basics

---

## 🛠️ How to Run

1. Import project into IDE
2. Add Spring Core dependencies (if not already added)
3. Run:

```
TestOrder.java
```

---

## 📌 Future Improvements

* Add constructor injection
* Add XML configuration version
* Convert into Spring Boot project
* Add REST API layer

---

## 👨‍💻 Author

**Your Name**

---

## ⭐ If you like this project

Give it a star ⭐ and feel free to fork it!

---
