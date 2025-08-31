import java.util.Scanner;
import java.util.UUID;  // for generating unique ticketId

class Ticket {
    private String ticketId;
    private String userName;
    private int age;
    private String source;
    private String destination;
    private double fare;

    public Ticket(String userName, int age, String source, String destination, double fare) {
        this.ticketId = UUID.randomUUID().toString().substring(0, 8); // random ticket ID
        this.userName = userName;
        this.age = age;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    public void printTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + userName + " (Age: " + age + ")");
        System.out.println("From: " + source + " → To: " + destination);
        System.out.println("Fare: ₹" + fare);
    }
}

public class Ticket_Booking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter source: ");
        String source = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        // Relational + Logical Operators (eligibility check)
        if (age < 18) {
            System.out.println(" Sorry, you must be 18+ to book a ticket.");
            return;
        }

        // Fare Calculation (Assignment + Type Conversion)
        double baseFare = 200.0;
        double distanceCharge = 50.0;
        double totalFare = baseFare + distanceCharge; // assignment operator used

        // Create Ticket Object
        Ticket ticket = new Ticket(name, age, source, destination, totalFare);

        // Print Ticket
        ticket.printTicket();

        sc.close();
    }
}
