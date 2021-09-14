package com.Maktab;

public class Toy {
    protected int id;
    protected int count;
    protected double basePrice;
    protected ToySize size;
    protected double discountedPrice = 0;
    private boolean isDiscounted = false;

    public Toy(int id, int count, double basePrice, ToySize size) {
        this.id = id;
        this.count = count;
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPrice() {
        if (isDiscounted) {
            return discountedPrice;
        } else {
            if (size.equals(ToySize.SMALL))
                return basePrice;
            else if (size.equals(ToySize.MEDIUM))
                return 1.5 * basePrice;
            else return 2 * basePrice;
        }

    }

    public void addDiscount(double discount) {
        discountedPrice = getPrice() * (1 - discount / 100);
        if (discount > 0)
            isDiscounted = true;
        else isDiscounted=false;
    }

    public void decreaseCount(int count) {
        if (this.count - count < 0)
            throw new IllegalArgumentException("Out of stock");
        else
            this.count -= count;
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }
}
