package com.example.UtilityLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount();
    }

    @Test
    void testDepositPositive() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDepositNegativeOrZero() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    void testWithdrawWithinBalance() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawExceedBalance() {
        account.deposit(50);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100));
    }
}

