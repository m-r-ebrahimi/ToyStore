package com.Maktab;

public class Customer {
    private String name;
    private int id;
    private Budget budget;
    private Cart cart = new Cart();

    public Customer(String name, int id, double budget) {
        this.name = name;
        this.id = id;
        this.budget = new Budget(budget);
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

    public void addToCart(int id, int amount) {
        cart.addItem(id, amount);
    }

    public void removeOfCart(int id, int amount) {
        cart.removeItem(id, amount);
    }

    public void removeOfCart(int id) {
        cart.removeItem(id);
    }

    public void buy() {
        if (budget.decreaseBalance(cart.getTotalPrice())) {
            Store.update(cart);
            cart = new Cart();
        } else {
            System.out.println("Your purchase was unsuccessful");
            return;
        }
    }
}
