package com.banking_domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking_domain.entities.Transaction;
import com.banking_domain.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public Transaction createTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	@Override 
	public Transaction getTransactionById(Long id) {
		return transactionRepository.findById(id).orElse(null);
	}
	
	@Override
	public List<Transaction> getAllTransations(){
		return transactionRepository.findAll();
	}
	
	@Override
	public Transaction updateTransaction(Long id, Transaction transaction) {
		Transaction exestingTransaction = transactionRepository.findById(id).orElse(null);
		if(exestingTransaction != null) {
		exestingTransaction.setAmount(transaction.getAmount());
		exestingTransaction.setTransation_Type(transaction.getTransation_Type());
		exestingTransaction.setTransationDateTime(transaction.getTransationDateTime());
		
		return transactionRepository.save(exestingTransaction);
		}
		return null;
		
	}
	
	@Override
	public void deleteTransaction(Long id) {
		transactionRepository.deleteById(id);
	}
	

}
