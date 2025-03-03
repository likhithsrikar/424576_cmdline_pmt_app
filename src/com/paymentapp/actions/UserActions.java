package com.paymentapp.actions;

import java.util.List;

import com.paymentapp.user.UserDetails;

public class UserActions {
    private List<UserDetails> users;

    
    public UserActions(List<UserDetails> users) {
        this.users = users;
    }

    
    public boolean registerUser(String userName, String password, String firstName, String lastName, String phoneNumber, String address) {
        
    	
        for (UserDetails user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("Username already exists. Please choose a different username.");
                return false;
            }
        }

       
        int userId = users.size() + 1; 
        UserDetails newUser = new UserDetails(userId, userName, password, firstName, lastName, phoneNumber, address);
        users.add(newUser);

        System.out.println("User registered successfully!");
        return true;
    }

   
    
    public UserDetails loginUser(String userName, String password) {
        for (UserDetails user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Invalid username or password.");
        return null;
    }
}