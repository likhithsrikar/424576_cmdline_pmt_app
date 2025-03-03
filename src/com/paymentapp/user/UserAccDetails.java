package com.paymentapp.user;

import java.sql.Date;

public class UserAccDetails {
    private int userAccountId;
    private UserDetails user; 
    private Date accountOpenDate;
    private double currentWalletBalance;
    private int linkedBankAccountsCount;
    private String walletPin;

    
    public UserAccDetails(int userAccountId, UserDetails user, Date accountOpenDate, double currentWalletBalance, int linkedBankAccountsCount, String walletPin) {
        this.userAccountId = userAccountId;
        this.user = user;
        this.accountOpenDate = accountOpenDate;
        this.currentWalletBalance = currentWalletBalance;
        this.linkedBankAccountsCount = linkedBankAccountsCount;
        this.walletPin = walletPin;
    }

    
    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    public Date getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(Date accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public double getCurrentWalletBalance() {
        return currentWalletBalance;
    }

    public void setCurrentWalletBalance(double currentWalletBalance) {
        this.currentWalletBalance = currentWalletBalance;
    }

    public int getLinkedBankAccountsCount() {
        return linkedBankAccountsCount;
    }

    public void setLinkedBankAccountsCount(int linkedBankAccountsCount) {
        this.linkedBankAccountsCount = linkedBankAccountsCount;
    }

    public String getWalletPin() {
        return walletPin;
    }

    public void setWalletPin(String walletPin) {
        this.walletPin = walletPin;
    }

    @Override
    public String toString() {
        return "UserAccountDetails{" +
                "userAccountId=" + userAccountId +
                ", user=" + user +
                ", accountOpenDate=" + accountOpenDate +
                ", currentWalletBalance=" + currentWalletBalance +
                ", linkedBankAccountsCount=" + linkedBankAccountsCount +
                ", walletPin='" + walletPin + '\'' +
                '}';
    }
}