package com.examples.service;

import com.examples.payment.model.Account;

public abstract class AccountService {
	public abstract void createAccount(int accountId, int accountBalance);
	
	public abstract void updateAccount(int accountId, int accountBalance);
	
	public abstract void deleteAccount(int accountId);
	
	public abstract Account getAccount(int accountId);
}
