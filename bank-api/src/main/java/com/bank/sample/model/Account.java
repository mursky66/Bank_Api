package com.bank.sample.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue
	private Long accountId;

	String accountNumber;

	BigDecimal currentBalance;
}
