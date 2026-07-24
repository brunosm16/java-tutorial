package com.baeldung.domain;

import java.time.LocalDateTime;

/**
 * Implements an Value Object(Immutable Object)
 */
public class Transaction {
    final BankAccount bankAccount;
    final LocalDateTime date;
    final double amount;

    public Transaction(BankAccount bankAccount, LocalDateTime date, double amount) {
        this.bankAccount = bankAccount;
        this.date = date;
        this.amount = amount;
    }
}
