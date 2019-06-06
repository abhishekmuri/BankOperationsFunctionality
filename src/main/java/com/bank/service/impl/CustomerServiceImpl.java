package com.bank.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Customer;
import com.bank.repository.CustomerRepository;
import com.bank.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public Customer getCustomer(Customer customer) {
		Optional<Customer> getCustomerDetails =  customerRepository.findById(customer.getId());
		return getCustomerDetails.isPresent() ? getCustomerDetails.get() : new Customer();
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
	}


}
