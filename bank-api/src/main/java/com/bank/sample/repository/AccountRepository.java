package com.bank.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.sample.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByAccountNumberEquals(String accountNumber);

}
