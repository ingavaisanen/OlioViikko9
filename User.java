package com.example.userprogram;

import java.lang.String;

public class User {

    private String firstName;
    public String getFirstName() {

        return firstName;
    }
    private String lastName;
    public String getLastName() {

        return lastName;
    }
    private String email;
    public String getEmail() {

        return email;
    }
    private String degreeProgram;
    public String getDegreeProgram() {

        return degreeProgram;
    }

    public User(String firstName, String lastName, String email, String degreeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }




}
