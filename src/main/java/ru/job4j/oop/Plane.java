package ru.job4j.oop;

public class Plane implements Vehicle {
    private int fuelPerHour;

    public Plane(int fuelPerHour) {
        this.fuelPerHour = fuelPerHour;
    }

    @Override
    public void move() {
        System.out.print(getClass().getSimpleName() + " - runway required;");
    }

    @Override
    public double workTime(int fuel) {
        return fuel / fuelPerHour;
    }
}
