package com.bank.service;

import com.bank.model.Account;

public interface AccountService {
	Account getAccount(Account account);
	void deposit(Account account);
	void withdraw(Account account);
}
