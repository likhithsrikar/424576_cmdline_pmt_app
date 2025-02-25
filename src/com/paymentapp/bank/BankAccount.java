package com.paymentapp.bank;

import com.paymentapp.user.UserDetails;

public class BankAccount {
    private int bankAccountId;
    private UserDetails user; // Relationship with UserDetails
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String branch;
    private AccountStatus accountStatus; // Linked to AccountStatus enum

    // Constructor
    public BankAccount(int bankAccountId, UserDetails user, String accountNumber, String ifscCode, String bankName, String branch, AccountStatus accountStatus) {
        this.bankAccountId = bankAccountId;
        this.user = user;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.branch = branch;
        this.accountStatus = accountStatus;
    }

    // Getters and Setters
    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccountId=" + bankAccountId +
                ", user=" + user +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", branch='" + branch + '\'' +
                ", accountStatus=" + accountStatus +
                '}';
    }
}