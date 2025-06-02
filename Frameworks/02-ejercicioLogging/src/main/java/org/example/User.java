package org.example;

public class User {
    private String email;
    private String password;
    private boolean isAuthenticated;
    private UserDatabase database;

    public User() {
        email = "";
        password = "";
        isAuthenticated = false;
        database = new UserDatabase();
    }

    public String getEmail() {
        return email;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void login(String email, String password) {
        isAuthenticated = database.findUser(email, password);
        if(isAuthenticated) {
            this.email = email;
            this.password = password;
        }
    }

    public void logout() {
        this.email = "";
        this.password = "";
        this.isAuthenticated = false;
    }
}
