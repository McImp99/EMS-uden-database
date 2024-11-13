import models.*;
import services.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        EventManager eventManager = new EventManager();
        NotificationServices notificationService = new NotificationServices();
        Scanner scanner = new Scanner(System.in);

        //Usermanagement
        System.out.println("Register a new user:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        userManager.registerUser(username, password, email);

        // Login
        System.out.println("\nLog in:");
        System.out.print("Username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Password: ");
        String loginPassword = scanner.nextLine();
        User loggedInUser = userManager.login(loginUsername, loginPassword);

        if (loggedInUser != null) {
            System.out.println("Welcome, " + loggedInUser.getUsername() + "!");

        //Add new events
            Event event1 = EventFactory.createEvent("Concert", "EDM Night", "A great EDM concert!", new Date(), "Ringsted");
            eventManager.addEvent(event1);
            notificationService.subscribe(loggedInUser);
            notificationService.notifyUsers("New event: " + event1.getTitle());

        //Show events
            System.out.println("\nAll Events:");
            eventManager.displayAllEvents();
        } else {
            System.out.println("Invalid credentials.");
        }

        scanner.close();
    }
}