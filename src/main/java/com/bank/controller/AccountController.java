package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Account;
import com.bank.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	@PostMapping("/getAccount")
	public ResponseEntity<?> getAccount(Account account){
		return new ResponseEntity<Account>(accountService.getAccount(account), HttpStatus.OK);
	}
	
	@PostMapping("/deposit")
	public void deposit(Account account){
		accountService.deposit(account);
	}
	@GetMapping("/withdraw")
	public void withdraw(Account account){
		accountService.withdraw(account);
	}
	
}
