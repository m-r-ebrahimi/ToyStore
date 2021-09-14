package com.Maktab;

import java.util.ArrayList;

public class Store {
    private static Car car;
    private Customer customer;
    private static ArrayList<Car> cars = new ArrayList<>();

    public Customer getCustomer() {
        return customer;
    }

    public static ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(int id, int amount, double basePrice, ToySize size) {
        car = new Car(id, amount, basePrice, size);
        cars.add(car);
    }

    public void addDiscount(int id, int discount) {
        for (int i = 0; i < cars.size(); i++) {
            car = (Car) cars.get(i);
            if (car.getId() == id) {
                car.addDiscount(discount);
                cars.add(i, car);
            }
        }
    }

    public static void update(Cart cart){
        ArrayList tempCart=cart.getFactor();
        Object[] item=new Object[3];
        for (int i = 0; i < tempCart.size(); i++) {
            item=(Object[])tempCart.get(i);
            removeCar((int)item[0],(int)item[2]);
        }
    }

    public static void removeCar(int id,int amount){
        for (int i = 0; i < cars.size(); i++) {
            car = (Car) cars.get(i);
            if (car.getId() == id) {
                if (amount < car.getCount()) {
                    car.setCount(car.getCount() - amount);
                    cars.add(i, car);
                } else
                    cars.remove(i);
            }
        }
    }
}
