package services;

import models.User;
import java.util.HashMap;


public class UserManager {
    //Singleton instance to ensure only one UserManager.
    private static UserManager instance;
    //HashMap with key String, brugernavnet and value is User.
    private HashMap<String, User> users = new HashMap<>();

    //private constructor to make sure the class can't be instanced, a part of singleton-pattern
    private UserManager() {}

    //A static method to return instance of UserManager, checks if there is 1, and if there isn't, returns new UserManager.
    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    //Method to register as new user, using 3 paramters, username, password and email, checks for already exisiting users to
    //ensure no duplicates, and if it is unique then adds the new User to the Hashmap
    public boolean registerUser(String username, String password, String email) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password, email, false));
        return true;
    }

    //Method to login as user, requires username and password
    public User login(String username, String password) {
        User user = users.get(username);
        return (user != null && user.checkPassword(password)) ? user : null;
    }

    public HashMap<String, User> getAllUsers() {
        return users;
    }

    /*
    Singleton pattern used to ensure only one instance of usermanagement, useful for classes that administers loads of data
    like users logininfo like email, password and usernames
     */
}
