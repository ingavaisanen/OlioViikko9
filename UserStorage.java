package com.example.userprogram;


import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage userstorage = null;


    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (userstorage == null) {
            userstorage = new UserStorage();
        }
        return userstorage;
    }

    public ArrayList<User> getUsers() {

        return users;
    }

    public void addUser(User user) {

        users.add(user);
    }

    public void listUser() {
        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getEmail() + " " + user.getDegreeProgram());
        }

    }
}
