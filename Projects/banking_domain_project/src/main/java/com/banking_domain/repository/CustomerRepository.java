package com.banking_domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking_domain.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
