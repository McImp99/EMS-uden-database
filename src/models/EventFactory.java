package models;

import java.util.Date;

/*
Method to create new event by using 5 parameters, type of event, title of event, description of event
date of the event and location for the event.
*/


public class EventFactory {
    public static Event createEvent(String type, String title, String description, Date date, String location) {
        return new Event(title, description, date, location, type);
    }

/*
Factory pattern to be able to create different types of events
 */
}
