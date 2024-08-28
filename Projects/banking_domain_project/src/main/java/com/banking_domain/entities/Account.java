package com.banking_domain.entities;

public class Account {
	private int id; 
	private Long account_Number;
	private String account_type;
	private Long balance;
	
	
	// Customer Table // @ManyToOne 
	// List of Transation  // @OneToMany

}
