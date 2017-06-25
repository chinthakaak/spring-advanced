package com.examples.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.payment.dao.AccountDaoImpl;
import com.examples.payment.model.Account;

@Component
public class AccountServiceImpl extends AccountService {
	private AccountDaoImpl accountDao;

	@Override
	public Account getAccount(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createAccount(int accountId, int accountBalance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount(int accountId, int accountBalance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(int accountId) {
		// TODO Auto-generated method stub
		
	}

}
