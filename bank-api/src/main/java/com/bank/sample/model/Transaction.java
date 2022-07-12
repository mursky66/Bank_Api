package com.bank.sample.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "transaction")
public class Transaction {
	@Id
	@GeneratedValue
	private Long transactionId;

	private String accountNumber;

	private BigDecimal transactionAmount;

	private Timestamp transactionDateTime;
}
