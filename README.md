#  Cinema Complex Management System (Java OOP)

A Java application that simulates a cinema hall's ticket management system. This project is designed to help users learn and practice **Object-Oriented Programming (OOP)** concepts, specifically focusing on **Inheritance** and **Encapsulation**.

---

##   Features

The system tracks essential metrics and manages sales for a single cinema hall:

* **Ticket Sales Management:** Handles sales for two types of tickets: **Normal** and **Reduced** rates.
* **Hall Status Tracking:** Monitors the number of **available seats**, calculates the current **occupancy rate**, and tracks the **total revenue**.
* **Show Reset Functionality:** Allows the hall counters to be easily **reset** for a new movie or show.

---

##   Project Structure

The core logic is divided into two main files:
```
src/
├── Hall.java       # Class representing a cinema hall
└── TestHall.java   # Main class to test ticket sales and hall status
```
---

## 🛠️ Key Concepts Applied

This project is an excellent demonstration of fundamental Java OOP principles:

* **Object-Oriented Programming (OOP):** Modeling real-world entities (the Hall and its sales) as objects.
* **Inheritance & Encapsulation:** Using classes and methods to manage the internal state of the `Hall` object, restricting direct access to crucial data like revenue and seat counts.
* **Polymorphism (for potential extensions):** The structure is set up to easily accommodate different ticket types or hall configurations in the future.
* **Collections (Future Scope):** An `ArrayList` could be used to manage multiple `Hall` objects, simulating a complete cinema complex.

---

##  How to Run

1.  **Clone the Repository:**
    ```bash
    git clone [your-repo-link]
    ```
2.  **Open in IDE:** Import the project into your preferred Java IDE (e.g., **Eclipse**, IntelliJ IDEA, VS Code).
3.  **Run:** Execute the `TestHall.java` file as a Java Application.

### Sample Output

The output demonstrates ticket sales, the status check, and the reset functionality:
Sale successful (Normal Price): 20 tickets. Sale successful (Reduced Price): 14 tickets.
```
Sale successful (Normal Price): 20 tickets.
Sale successful (Reduced Price): 14 tickets.

---- Hall Status -----
Movie: Titanic
Ticket Price: 75.5 DH
Total Seats: 60
Normal Tickets Sold: 20
Reduced Tickets Sold: 14
Available Seats: 26
Occupancy Rate: 56.67 %
Revenue: 2355.6000000000004 DH

--- New Movie ---
Current Movie: Avatar 2
Hall has been reset for the next show.
Available seats after reset: 60
```

---

##   License

This is an **educational project** created for learning Java OOP and basic management system simulation. You are free to use, modify, and distribute it for non-commercial, learning purposes.
