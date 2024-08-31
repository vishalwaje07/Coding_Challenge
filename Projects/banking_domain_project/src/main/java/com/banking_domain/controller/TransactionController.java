package com.banking_domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking_domain.entities.Transaction;
import com.banking_domain.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction){
		return ResponseEntity.ok(transactionService.createTransaction(transaction));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id){
		return ResponseEntity.ok(transactionService.getTransactionById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<Transaction>> getAllTransactions(){
		return ResponseEntity.ok(transactionService.getAllTransations());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTransaction(@PathVariable Long id){
		transactionService.deleteTransaction(id);
		return ResponseEntity.noContent().build();
	}
	
}
