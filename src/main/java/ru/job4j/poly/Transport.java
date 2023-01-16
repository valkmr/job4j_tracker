package ru.job4j.poly;

public interface Transport {
    int PRICE = 10;

    void drive();

    void passangers(int count);

    int fuel(int price);
}
