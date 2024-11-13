package models;

import java.util.Date;

public class Event {
    private String title;
    private String description;
    private Date date;
    private String location;
    private String type;

    //constructor
    public Event(String title, String description, Date date, String location, String type) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
        this.type = type;
    }
    //getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Date getDate() { return date; }
    public String getLocation() { return location; }
    public String getType() { return type; }

    //Method to print out description of the event (details)
    public void displayDetails() {
        System.out.println(type + " Event: " + title + " at " + location + " on " + date);
    }
}