package com.banking_domain.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(unique = true)
	private Long account_Number;

	@NotEmpty
	private String account_type;

	@NotEmpty
	private BigDecimal balance;

	// Customer Table. @ManyToOne
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	// List of Transaction. @OneToMany
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	private List<Transaction> transations = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccount_Number() {
		return account_Number;
	}

	public void setAccount_Number(Long account_Number) {
		this.account_Number = account_Number;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Transaction> getTransations() {
		return transations;
	}

	public void setTransations(List<Transaction> transations) {
		this.transations = transations;
	}

}
