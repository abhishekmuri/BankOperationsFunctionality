package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Customer;
import com.bank.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping("/addCustomer")
	public void addCustomer(Customer customer){
		customerService.addCustomer(customer);
	}
	
	@GetMapping("/getCustomer")
	public Customer getCustomer(Customer customer){
		return customerService.getCustomer(customer);
	}
	
	@PostMapping("/deleteCustomer")
	public void deleteCustomer(Customer customer){
		customerService.deleteCustomer(customer);
	}
}
