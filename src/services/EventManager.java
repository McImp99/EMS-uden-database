package services;

import models.Event;
import java.util.ArrayList;

public class EventManager {
    private ArrayList<Event> events = new ArrayList<>();

    //Method to add to the events list
    public void addEvent (Event event) {
        events.add(event);
    }

    //Method that returns all events that have been saved in events
    public ArrayList<Event> getAllEvents() {
        return events;
    }

    //Method to displayallevents, by going through the private Arraylist EventManager and displays every detail about the event
    public void displayAllEvents() {
        for (Event event : events) {
            event.displayDetails();
        }
    }
}
