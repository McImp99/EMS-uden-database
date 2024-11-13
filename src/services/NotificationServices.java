package services;

import java.util.ArrayList;
import models.User;

public class NotificationServices {
    private ArrayList<User> subscribers = new ArrayList<>();

    //Method to subscribe for notifications
    public void subscribe(User user) {
        subscribers.add(user);
    }

    //Method to unsubscribe for notifications
    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    //Method to send a message to all users listed as subscribers using a enhanced for loop to go through
    public void notifyUsers(String message) {
        for (User user : subscribers) {
            System.out.println("Notifying " + user.getEmail() + ": " + message);
        }
    }

    /*
    Observer pattern used to handle notifications to multiple users without specifically knowing which ones whenever
    there are any changes to the event
     */
}
