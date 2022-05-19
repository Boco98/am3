package org.unibl.etf.pisio.am3.models;

public class User {
    private String FirstName;
    private String LastName;

    public User(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
    public User(){

    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
