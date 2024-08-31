package com.banking_domain.service;

import java.util.List;

import com.banking_domain.entities.Customer;

public interface CustomerService {
	Customer createCustomer(Customer customer);

	Customer getCustomerById(Long id);

	List<Customer> getAllCustomers();

	Customer updateCustomer(Long id, Customer customer);

	void deleteCustomer(Long id);

}
