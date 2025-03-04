package com.paymentapp.interfaces;

import com.paymentapp.user.UserDetails;

public interface UserActionsInt {
	
	    boolean registerUser(String userName, String password, String firstName, String lastName, String phoneNumber, String address);
	    UserDetails loginUser(String userName, String password);
	}

