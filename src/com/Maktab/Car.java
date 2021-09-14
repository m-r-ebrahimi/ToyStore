package com.Maktab;

import com.Maktab.Toy;

public class Car extends Toy {

    public Car(int id, int count, double basePrice, ToySize size) {
        super(id, count, basePrice, size);
    }

    @Override
    public double getPrice() {
        if (size.equals(ToySize.SMALL))
            return 2 * basePrice;
        else if (size.equals(ToySize.MEDIUM))
            return 2.5 * basePrice;
        else return 3 * basePrice;
    }

}
