public class Card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    // Default constructor
    public Card() {
        this.cardNumber = 0;
        this.balance = 0.0;
        this.pin = 0;
        this.status = false;
    }

    // Parameterized constructor
    public Card(int cardNumber, double balance, int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    // Getters and Setters
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Display method
    public void display() {
        System.out.print("Card Details: ");
        System.out.print("Card Number: " + cardNumber);
        System.out.print("Balance: $" + balance);
        System.out.print("Pin: " + pin);
        System.out.print("Status: " + (status ? "Active" : "Inactive"));
    }
}
