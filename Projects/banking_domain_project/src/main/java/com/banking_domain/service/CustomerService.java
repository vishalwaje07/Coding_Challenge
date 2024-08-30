package com.banking_domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking_domain.entities.Customer;
import com.banking_domain.exception.ResourceNotFoundException;
import com.banking_domain.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	 public Customer getCustomerById(Long id) throws ResourceNotFoundException {
		 
		 return customerRepository.findById(id)
         .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));
	    }
	
}
