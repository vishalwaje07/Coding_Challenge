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

import com.banking_domain.entities.Account;
import com.banking_domain.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		return ResponseEntity.ok(accountService.createAccount(account));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Account> getAccountById(@PathVariable Long id){
		return ResponseEntity.ok(accountService.getAccountById(id));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Account>> getAllAccounts(){
		return ResponseEntity.ok(accountService.getAllAccounts());
	}

	@PutMapping
	public ResponseEntity<Account> updateAccount(@PathVariable Long id, Account account){
		return ResponseEntity.ok(accountService.updateAccount(id, account));
	}
	
	@DeleteMapping
	public ResponseEntity<Account> deleteAccount(@PathVariable Long id){
		accountService.deleteAccount(id);
		return ResponseEntity.noContent().build();
	}
}
