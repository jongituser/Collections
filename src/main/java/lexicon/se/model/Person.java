package lexicon.se.model;

public class Person extends AppUser {

    private int id;
    private String firstName;
    private String lastName;
    private String email;


    public Person(int id, String firstName, String lastName, String email, String username, String password, AppRole role) {

        super(username,password,role);

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null");
        }

        this.firstName = firstName;

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null");
        }

        this.lastName = lastName;

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null");

            }
        this.email = email;


        this.id = id;


    }


    public int getId() {

        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSummary() {
        return "Id: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email;
    }

}