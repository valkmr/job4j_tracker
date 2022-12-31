package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active - " + active);
        System.out.println("Status - " + status);
        System.out.println("Description - " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        System.out.println();
        Error errorNext = new Error(false, 0, "Duplicate");
        errorNext.printInfo();
        System.out.println();
        Error errorPrevious = new Error(true, 1, "Indefinable");
        errorPrevious.printInfo();
    }
}
