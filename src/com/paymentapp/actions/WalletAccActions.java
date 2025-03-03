package com.paymentapp.actions;

import com.paymentapp.user.UserAccDetails;
import com.paymentapp.user.UserDetails;

public class WalletAccActions {
    private UserDetails user; 
   
    public WalletAccActions(UserDetails user) {
        this.user = user;
    }

    
    public void checkBalance() {
        UserAccDetails walletAccount = user.getUserAccDetails();
        if (walletAccount != null) {
            System.out.println("Wallet Balance: " + walletAccount.getCurrentWalletBalance());
        } else {
            System.out.println("No wallet account found for the user.");
        }
    }
}