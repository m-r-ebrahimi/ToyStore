package com.Maktab;

public class Customer {
    private String name;
    private int id;
    private Budget budget;
    private Cart cart;

    public Customer(String name, int id, double budget) {
        this.name = name;
        this.id = id;
        this.budget =new Budget(budget);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Budget getBudget() {
        return budget;
    }

    public void addToCart(int id){

    }
}
