package com.paymentapp.actions;

import com.paymentapp.user.UserDetails;
import com.paymentapp.interfaces.WalletAccActionsInt;
import com.paymentapp.user.UserAccDetails;

public class WalletAccActions implements WalletAccActionsInt {
    private UserDetails user; 

    
    public WalletAccActions(UserDetails user) {
        this.user = user;
    }

    @Override
    public void checkBalance() {
        UserAccDetails walletAccount = user.getUserAccDetails();
        if (walletAccount != null) {
            System.out.println("Wallet Balance: " + walletAccount.getCurrentWalletBalance());
        } else {
            System.out.println("No wallet account found for the user.");
        }
    }
}