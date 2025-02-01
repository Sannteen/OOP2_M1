public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card;

    // Default constructor
    public Client() {
        this.idNumber = 0;
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.card = new Card();
    }

    // Parameterized constructor
    public Client(int idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;  // Default age
        this.card = new Card();
    }

    // Getters and Setters
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    // Display Client details
    public void display() {
        System.out.println("Client Details:");
        System.out.println("ID: " + idNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        card.display();
    }
}
