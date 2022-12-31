package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveName(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("name - " + this.name + System.lineSeparator() + "food - " + this.food);
    }

    public static void main(String[] args) {
        Cat one = new Cat();
        one.giveName("black");
        one.eat("milk");
        one.show();
    }
}
