package com.banking_domain.service;

import java.util.List;

import com.banking_domain.entities.Transaction;

public interface TransactionService {
	Transaction createTransaction(Transaction trasaction);
	Transaction getTransactionById(Long id);
	List<Transaction> getAllTransations();
	Transaction updateTransaction(Long id, Transaction transation);
	void deleteTransaction(Long id);

}
