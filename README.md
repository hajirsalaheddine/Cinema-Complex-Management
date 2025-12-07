# Cinema Complex Management

A Java application simulating a cinema hall ticket management system.
Tracks ticket sales, occupancy rate, and total revenue for multiple shows in a cinema hall.

---

## Features

-Manage ticket sales for Normal and Reduced rates.
-Track available seats, occupancy rate, and total revenue.
-Reset hall counters for new shows.


---

### Project Structure

src/
├── Hall.java       # Class representing a cinema hall
└── TestHall.java   # Main class to test ticket sales and hall status

---

#### How to Run

1.Open the project in Eclipse or any Java IDE.
2.Run TestHall.java as a Java Application.
Sample Output:

Sale successful (Normal Price): 20 tickets.
Sale successful (Reduced Price): 14 tickets.

--- Hall Status ---
Movie: Titanic
Ticket Price: 75.5 USD
Total Seats: 60
Normal Tickets Sold: 20
Reduced Tickets Sold: 14
Available Seats: 26
Occupancy Rate: 56.67 %
Revenue: 2078.0 USD

--- New Movie ---
Current Movie: Avatar 2
Hall has been reset for the next show.
Available seats after reset: 60

---

##### Key Concepts

*Object-Oriented Programming (OOP)*
*Inheritance & Encapsulation*
*Polymorphism (for potential extensions)*
*Collections (ArrayList can be used for multiple halls)*

---

###### License

Educational project created for learning Java OOP and cinema hall management.
