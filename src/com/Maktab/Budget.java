package com.Maktab;

public class Budget {
    private double balance;

    public Budget(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void decreaseBalance(double amount) {
        if (balance - amount < 0)
            throw new IllegalArgumentException("Your balance is not enough!");
        else
            balance -= amount;
    }
}
