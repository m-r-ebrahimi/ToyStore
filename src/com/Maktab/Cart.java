package com.Maktab;

import java.util.ArrayList;

public class Cart {
    private Object[] customerFactor = new Object[3];
    private ArrayList factor = new ArrayList<>();

    public void addItem(int id, int amount) {
        for (int i = 0; i < factor.size(); i++) {
            customerFactor = (Object[]) factor.get(i);
            if (customerFactor[0].equals(id)) {
                customerFactor[2] = Integer.parseInt(customerFactor[2].toString()) + amount;
            } else {
                customerFactor[0] = id;
                customerFactor[1] = getPrice(id);
                customerFactor[2] = amount;
                factor.add(customerFactor);
            }
        }
    }

    public void removeItem(int id, int amount) {
        for (int i = 0; i < factor.size(); i++) {
            customerFactor = (Object[]) factor.get(i);
            if (customerFactor[0].equals(id)) {
                if (amount < Integer.parseInt(customerFactor[2].toString())) {
                    customerFactor[2] = Integer.parseInt(customerFactor[2].toString()) - amount;
                    factor.add(i, customerFactor);
                } else
                    factor.remove(i);
            }
        }
    }

    public void removeItem(int id) {
        for (int i = 0; i < factor.size(); i++) {
            customerFactor = (Object[]) factor.get(i);
            if (customerFactor[0].equals(id)) {
                factor.remove(i);
            }
        }
    }

    public double getPrice(int id) {
        double price = -1;
        for (int i = 0; i < Store.getCars().size(); i++) {
            customerFactor = (Object[]) factor.get(i);
            if (customerFactor[0].equals(id))
                price = (double) customerFactor[1];
        }
        return price;
    }

    public double getTotalPrice() {
        double price = 0;
        for (int i = 0; i < factor.size(); i++) {
            customerFactor = (Object[]) factor.get(i);
            price += (double) customerFactor[1] * (double) customerFactor[2];
        }
        return price;
    }

    public ArrayList<Object> getFactor() {
        return factor;
    }
}
