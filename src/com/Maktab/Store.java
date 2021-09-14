package com.Maktab;

public class Store {
    private Customer[] customer;
    private static Car[] cars=new Car[1];

    private int lastIndex = 0;

    public Customer[] getCustomer() {
        return customer;
    }

    public static Car[] getCars() {
        return cars;
    }

    public void addCar(int id, int amount, double basePrice, ToySize size) {
        cars[lastIndex] = new Car(id, amount, basePrice, size);
    }
    public void addDiscount(int id,int discount){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getId()==id)
                cars[i].addDiscount(discount);
        }
    }
    
}
