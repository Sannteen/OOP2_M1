import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Client Details
        System.out.println("Enter Client ID:");
        int id = getValidInteger(scanner);

        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        System.out.println("Enter Age:");
        int age = getValidInteger(scanner);

        // Input Card Details
        System.out.print("Enter Card Number: ");
        int cardNumber = getValidInteger(scanner);

        System.out.print("Enter Balance: ");
        double balance = getValidDouble(scanner);

        System.out.print("Enter PIN: ");
        int pin = getValidInteger(scanner);

        System.out.print("Enter Card Status (true for active, false for inactive):");
        boolean status = scanner.nextBoolean();

        // Create Client and Card objects
        Client client = new Client(id, firstName, lastName);
        client.setAge(age);
        Card card = new Card(cardNumber, balance, pin, status);
        client.setCard(card);

        // Display Client and Card details
        System.out.println("\n--- Client Information ---");
        client.display();

        // Modify Card Attributes
        modifyCardAttributes(client.getCard());

        // Display Updated Card Details
        System.out.println("\n--- Updated Card Information ---");
        client.getCard().display();

        scanner.close();
    }

    // Method to modify card attributes
    public static void modifyCardAttributes(Card card) {
        card.setStatus(true);
        card.setPin(45678);
        System.out.println("\nCard status set to active and PIN updated.");
    }

    // Method to get valid integer input
    private static int getValidInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Method to get valid double input
    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
