package com.banking_domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String transation_Type;

	@NotEmpty
	private BigDecimal amount;

	@NotEmpty
	private LocalDateTime transationDateTime;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTransation_Type() {
		return transation_Type;
	}

	public void setTransation_Type(String transation_Type) {
		this.transation_Type = transation_Type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransationDateTime() {
		return transationDateTime;
	}

	public void setTransationDateTime(LocalDateTime transationDateTime) {
		this.transationDateTime = transationDateTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
