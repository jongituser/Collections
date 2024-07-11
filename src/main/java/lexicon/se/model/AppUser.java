package lexicon.se.model;

public class AppUser {

    // Private fields
    private String username;
    private String password;
    private AppRole role;

    // Constructor
    public AppUser(String username, String password, AppRole role) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;

        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        this.password = password;

        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null or empty");
        }

        this.role = role;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }


    public String getSummary() {
        return "Username: " + username + ", Role: " + role;
    }
}