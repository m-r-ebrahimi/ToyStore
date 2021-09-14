package com.Maktab;

public class Cart {
    private int lastIndex = 0;
    private double[][] factor = new double[1][3];

    public Cart(int id, int amount) {
        factor[lastIndex][0] = id;
        factor[lastIndex][1] = getPrice(id);
        factor[lastIndex][2] = amount;
    }

    public double getPrice(int id) {
        double price = -1;
        for (int i = 0; i < Store.getCars().length; i++) {
            if (Store.getCars()[i].getId() == id)
                price = Store.getCars()[i].getPrice();
        }
        return price;
    }

    public double[][] getFactor() {
        return factor;
    }
}
