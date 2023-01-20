package ru.job4j.oop;

public class Train implements Vehicle {
    private int fuelPerHour;

    public Train(int fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " - railway is required;");
    }

    @Override
    public double workTime(int fuel) {
        return fuel / fuelPerHour;
    }
}
