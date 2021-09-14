package com.Maktab;

public class Budget {
    private double balance;

    public Budget(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean decreaseBalance(double amount) {
        if (balance - amount < 0) {
            System.out.println("Your balance is not enough!");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
