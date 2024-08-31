package com.banking_domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking_domain.entities.Account;
import com.banking_domain.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account getAccountById(Long id) {
		return accountRepository.findById(id).orElse(null);
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public Account updateAccount(Long id, Account account) {
		Account existingAccount = accountRepository.findById(id).orElse(null);
		if (existingAccount != null) {
			existingAccount.setAccount_Number(account.getAccount_Number());
			existingAccount.setAccount_type(account.getAccount_type());
			existingAccount.setBalance(account.getBalance());
			existingAccount.setId(account.getId());

			return accountRepository.save(existingAccount);
		}
		return null;
	}

	@Override
	public void deleteAccount(Long id) {
		accountRepository.deleteById(id);
	}
}
