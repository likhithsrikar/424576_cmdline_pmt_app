package com.paymentapp.actions;

import com.paymentapp.bank.BankAccount;
import com.paymentapp.user.UserDetails;

public class BankAccActions {
    private UserDetails user; 
    
    
    public BankAccActions(UserDetails user) {
        this.user = user;
    }

    
    public void checkBalance(int bankAccountId) {
        for (BankAccount account : user.getBankAccounts()) {
            if (account.getBankAccountId() == bankAccountId) {
                System.out.println("Balance for Bank Account ID " + bankAccountId + ": " + account.getBalance());
                return;
            }
        }
        System.out.println("Bank Account ID " + bankAccountId + " not found.");
    }

    public void checkStatus(int bankAccountId) {
        for (BankAccount account : user.getBankAccounts()) {
            if (account.getBankAccountId() == bankAccountId) {
                System.out.println("Status for Bank Account ID " + bankAccountId + ": " + account.getAccountStatus());
                return;
            }
        }
        System.out.println("Bank Account ID " + bankAccountId + " not found.");
    }
}