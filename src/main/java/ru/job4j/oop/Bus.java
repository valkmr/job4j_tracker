package ru.job4j.oop;

public class Bus implements Vehicle {
    private int fuelPerHour;

    public Bus(int fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " - road required;");
    }

    @Override
    public double workTime(int fuel) {
        return fuel / fuelPerHour;
    }
}
