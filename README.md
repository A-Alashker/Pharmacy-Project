# Pharmacy Management System 
This is a console application that simulates the basic operations of a pharmacy. It allows users to manage a list of drugs, place orders, and track daily sales. The system is designed to categorize drugs into cosmetics, prescription drugs, and others.

![image](https://github.com/A-Alashker/Pharmacy-Project/blob/main/1.png?raw=true)

## How it works?
When the application runs, the user is prompted to define the capacity of the pharmacy(how many different drugs it can hold). Afterward, a menu is continuously displayed until the user chooses to exit.
![image](https://github.com/A-Alashker/Pharmacy-Project/blob/main/2.jpg?raw=true)

Then a menu of options contain:
### 1. Add Drug 
![image](https://github.com/A-Alashker/Pharmacy-Project/blob/main/3.jpg?raw=true)

Add a new drug to the pharmacy inventory.

Details required: name, id, price, category, and available quantity.

The drug is only added if the maximum capacity hasn't been reached.

### 2. Remove Drug
![image](https://github.com/A-Alashker/Pharmacy-Project/blob/main/4.jpg?raw=true)

Remove a drug from inventory using its unique id.

### 3. Place an Order
![image](https://github.com/A-Alashker/Pharmacy-Project/blob/main/5.jpg?raw=true)

Search for a drug by id and display its price.

If it’s a prescription drug, the system asks for a prescription.

If it’s a cosmetic, it's sold at 120% of its base price.

The system records each order’s quantity and total price for daily sales reporting.

### 4. Get Total Sales for the Day
![image](https://github.com/A-Alashker/Pharmacy-Project/blob/main/6.jpg?raw=true)

Calculates and displays the total revenue from all orders made during the day.

### 5. Exit

Terminates the application.
