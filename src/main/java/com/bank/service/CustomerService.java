package com.bank.service;

import com.bank.model.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	Customer getCustomer(Customer customer);
	void deleteCustomer(Customer customer);
}
