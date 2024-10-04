package com.example;

public class BankAccount {
    private double balance;
    private boolean isClosed;

    public BankAccount() {
        this.balance = 0.0;  // Initialize with zero balance
        this.isClosed = false; // Initially, the account is open
    }

    public void deposit(double amount) {
        if (isClosed) {
            throw new IllegalStateException("Account is closed. Cannot deposit.");
        }
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (isClosed) {
            throw new IllegalStateException("Account is closed. Cannot withdraw.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        if (amount > 0) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void closeAccount() {
        if (!isClosed) {
            isClosed = true; // Mark account as closed
            // If balance is less than 50.0, set it to 50.0
            if (balance < 50.0) {
                balance = 50.0; // Ensure that balance is at least 50.0 when closed
            }
        }
    }

    public boolean isClosed() {
        return isClosed;
    }
}
