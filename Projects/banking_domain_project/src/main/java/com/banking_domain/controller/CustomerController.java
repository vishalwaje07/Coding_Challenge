package com.banking_domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking_domain.entities.Customer;
import com.banking_domain.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.createCustomer(customer));

	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long Id){
		return ResponseEntity.ok(customerService.getCustomerById(Id));
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return ResponseEntity.ok(customerService.getAllCustomers());
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
		return ResponseEntity.ok(customerService.updateCustomer(id, customer));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable Long id){
		customerService.deleteCustomer(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
}
