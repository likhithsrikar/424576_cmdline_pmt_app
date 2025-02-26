package com.paymentapp.user;

import java.sql.Date;

public class UserAccDetails {
    private int userAccountId;
    private UserDetails user; 
    private Date accountOpenDate;
    private double currentWalletBalance;
    private int linkedBankAccountsCount;
    private String walletPin;
	
    public UserAccDetails(int userAccountId, UserDetails user, Date accountOpenDate, double currentWalletBalance,
			int linkedBankAccountsCount, String walletPin) {
		super();
		this.userAccountId = userAccountId;
		this.user = user;
		this.accountOpenDate = accountOpenDate;
		this.currentWalletBalance = currentWalletBalance;
		this.linkedBankAccountsCount = linkedBankAccountsCount;
		this.walletPin = walletPin;
	}
	/**
	 * @return the userAccountId
	 */
	public int getUserAccountId() {
		return userAccountId;
	}
	/**
	 * @param userAccountId the userAccountId to set
	 */
	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
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
	 * @return the accountOpenDate
	 */
	public Date getAccountOpenDate() {
		return accountOpenDate;
	}
	/**
	 * @param accountOpenDate the accountOpenDate to set
	 */
	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	/**
	 * @return the currentWalletBalance
	 */
	public double getCurrentWalletBalance() {
		return currentWalletBalance;
	}
	/**
	 * @param currentWalletBalance the currentWalletBalance to set
	 */
	public void setCurrentWalletBalance(double currentWalletBalance) {
		this.currentWalletBalance = currentWalletBalance;
	}
	/**
	 * @return the linkedBankAccountsCount
	 */
	public int getLinkedBankAccountsCount() {
		return linkedBankAccountsCount;
	}
	/**
	 * @param linkedBankAccountsCount the linkedBankAccountsCount to set
	 */
	public void setLinkedBankAccountsCount(int linkedBankAccountsCount) {
		this.linkedBankAccountsCount = linkedBankAccountsCount;
	}
	/**
	 * @return the walletPin
	 */
	public String getWalletPin() {
		return walletPin;
	}
	/**
	 * @param walletPin the walletPin to set
	 */
	public void setWalletPin(String walletPin) {
		this.walletPin = walletPin;
	}
	@Override
	public String toString() {
		return "UserAccDetails [userAccountId=" + userAccountId + ", user=" + user + ", accountOpenDate="
				+ accountOpenDate + ", currentWalletBalance=" + currentWalletBalance + ", linkedBankAccountsCount="
				+ linkedBankAccountsCount + ", walletPin=" + walletPin + "]";
	}

    
}