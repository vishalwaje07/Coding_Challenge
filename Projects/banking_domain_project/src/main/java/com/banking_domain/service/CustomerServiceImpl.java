package com.banking_domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking_domain.entities.Customer;
import com.banking_domain.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	@Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}
	
	@Override
	public List <Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	@Override
	public Customer updateCustomer(Long id, Customer customer) {
		Customer existingCustomer = customerRepository.findById(id).orElse(null);
		if(existingCustomer != null) {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAccounts(customer.getAccounts());
			existingCustomer.setAddress(customer.getAddress());
			existingCustomer.setEmail(customer.getEmail());
			existingCustomer.setId(customer.getId());
			existingCustomer.setPhone_Number(customer.getPhone_Number());
			
			return customerRepository.save(existingCustomer);
		}
		return null;
		
	}
	
	@Override 
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
	

}
