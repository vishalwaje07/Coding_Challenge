package com.banking_domain.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.banking_domain.entities.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
