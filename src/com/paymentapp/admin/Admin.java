package com.paymentapp.admin;


import java.util.List;

import com.paymentapp.appdata.AppData;
import com.paymentapp.user.UserDetails;

public class Admin {
    private AppData appData;
    
    public Admin(AppData appData) {
        this.appData = appData;
    }


    public void displayAllUsers() {
        List<UserDetails> users = appData.getAllUsers();
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("List of all users:");
            for (UserDetails user : users) {
                System.out.println(user);
            }
        }
    }
}