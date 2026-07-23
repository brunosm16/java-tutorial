package com.baeldung.domain;

import java.time.LocalDateTime;
import java.time.Month;

public class BankAccount {
    String name;
    LocalDateTime openedAt;
    double balance;

    // No-argument constructor
    public BankAccount() {
        this.name = "";
        this.openedAt = LocalDateTime.now();
        this.balance = 0.0d;
    }

    // Parametrized constructor
    public BankAccount(String name, LocalDateTime openedAt, double balance) {
        this.name = name;
        this.openedAt = openedAt;
        this.balance = balance;
    }

    // Copy constructor
    public BankAccount(BankAccount other) {
        this.name = other.name;
        this.openedAt = LocalDateTime.now();
        this.balance = 0.18f;
    }

    // Chained constructor
    public BankAccount(String name) {
        // This allows to call the other constructor
        this(name, LocalDateTime.now(), 157.70d);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %f", this.name, this.openedAt.toString(), this.balance);
    }

    public static void main(String[] args) {
        LocalDateTime openedAt = LocalDateTime.of(2026, Month.JULY, 1, 14, 30, 15);
        BankAccount bank1 = new BankAccount("Nubank", openedAt, 252.15d);
        System.out.println(bank1.toString());
        BankAccount bank2 = new BankAccount(bank1);
        System.out.println("Printing second bank: " + bank2);
        BankAccount bank3 = new BankAccount("Itau");
        System.out.println("Printing third bank: " + bank3);
    }
}
