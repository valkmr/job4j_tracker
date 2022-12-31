package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public double devide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return y * x;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + sum(10));
        System.out.println("Sum: " + minus(3));
        System.out.println("Sum: " + calculator.sumAllOperation(5));
        System.out.println("Sum: " + calculator.devide(5));

    }
}
