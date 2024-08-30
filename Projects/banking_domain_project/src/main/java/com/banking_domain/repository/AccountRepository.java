package com.banking_domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking_domain.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
