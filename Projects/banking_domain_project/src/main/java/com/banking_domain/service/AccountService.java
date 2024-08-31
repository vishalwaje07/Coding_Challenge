package com.banking_domain.service;

import java.util.List;

import com.banking_domain.entities.Account;


public interface AccountService {
	Account createAccount(Account account);
	Account getAccountById(Long id);
	List<Account> getAllAccounts();
	Account updateAccount(Long id, Account account);
	void deleteAccount(Long id);

}
