package models;

public class User {

    private String username;
    private String password;
    private String email;
    private boolean isAdmin;

    //constructor
    public User(String username, String password, String email, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    //Getters
    public String getUsername() { return username;}
    public String getEmail() { return email;}
    public boolean isAdmin() { return isAdmin;}

    //Checks password against stored password
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }


}
