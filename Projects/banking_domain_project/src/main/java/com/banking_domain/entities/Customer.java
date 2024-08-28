package com.banking_domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private Long phone_Number;
	private String address;
	
	// List of account //One to many 
	private List<Account> account = new ArrayList<>();
	
}
