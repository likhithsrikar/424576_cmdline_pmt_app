package com.paymentapp.bank;

import com.paymentapp.user.UserDetails;

public class BankAccount {
    private int bankAccountId;
    private UserDetails user;
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String branch;
    private AccountStatus accountStatus;
    private double balance; 

    public BankAccount(int bankAccountId, UserDetails user, String accountNumber, String ifscCode, String bankName, String branch, AccountStatus accountStatus, double balance) {
        this.bankAccountId = bankAccountId;
        this.user = user;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
        this.bankName = bankName;
        this.branch = branch;
        this.accountStatus = accountStatus;
        this.balance = balance;
    }
    /**
	 * @return the bankAccountId
	 */
	public int getBankAccountId() {
		return bankAccountId;
	}



	/**
	 * @param bankAccountId the bankAccountId to set
	 */
	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	/**
	 * @return the user
	 */
	public UserDetails getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserDetails user) {
		this.user = user;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}
	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @return the accountStatus
	 */
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
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
                ", balance=" + balance +
                '}';
    }
}