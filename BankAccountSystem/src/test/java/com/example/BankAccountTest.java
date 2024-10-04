package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testCloseAccount() {
        BankAccount account = new BankAccount();
        account.deposit(100.0); // Deposit more than 50.0
        account.closeAccount();
        assertEquals(100.0, account.getBalance(), "Balance should remain at 100.0 after closing.");

        // Now withdraw to bring the balance below 50
        // Create a new account to test the below 50 case, since the first account is already closed.
        BankAccount account2 = new BankAccount();
        account2.deposit(30.0); // Deposit to get a balance below 50
        account2.closeAccount();
        assertEquals(50.0, account2.getBalance(), "Balance should be set to 50.0 after closing with a balance below.");
    }
}
