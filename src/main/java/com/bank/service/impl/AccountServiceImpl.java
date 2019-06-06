package com.bank.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;
import com.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired 
	private AccountRepository accountRepository;
	
	@Override
	public void deposit(Account account) {
		Optional<Account> acc = getAccountDetails(account);
		if(acc.isPresent()){
			Account exitingAccount = acc.get();
			exitingAccount.setAmount(exitingAccount.getAmount().add(account.getAmount()));
			account = exitingAccount;
		}
		accountRepository.save(account);
	}

	private Optional<Account> getAccountDetails(Account account) {
		Optional<Account> acc= accountRepository.findById(account.getId());
		return acc;
	}

	@Override
	public void withdraw(Account account) {
		Optional<Account> acc = getAccountDetails(account);
		if(acc.isPresent()){
			Account exitingAccount = acc.get();
			exitingAccount.setAmount(exitingAccount.getAmount().subtract(account.getAmount()));
			account = exitingAccount;
		}
		accountRepository.save(account);
	}

	@Override
	public Account getAccount(Account account) {
		Optional<Account> acc = getAccountDetails(account);
		return acc.isPresent() ? acc.get():new Account();
	}
	

}
