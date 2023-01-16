package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Move straight");
    }

    @Override
    public void passangers(int count) {
        System.out.println(count + " passanger(s) in the vehicle");
    }

    @Override
    public int fuel(int liters) {
        return Transport.PRICE * liters;
    }
}
