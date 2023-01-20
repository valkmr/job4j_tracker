package ru.job4j.oop;

public class Moving {
    public static void main(String[] args) {
        Vehicle boing737 = new Plane(3000);
        Vehicle boing777 = new Plane(8500);
        Vehicle an225Mria = new Plane(15900);
        Vehicle mercedesBenzeCitaro = new Bus(28);
        Vehicle yutongU12 = new Bus(20);
        Vehicle manLionsCity12g = new Bus(25);
        Vehicle twoTE116 = new Train(160);
        Vehicle tem2 = new Train(230);
        Vehicle chmez = new Train(300);
        Vehicle[] vehicles = new Vehicle[] {boing737, boing777, an225Mria,
                                            mercedesBenzeCitaro, yutongU12, manLionsCity12g, twoTE116, tem2, chmez};
        for (Vehicle v : vehicles) {
            v.move();
            System.out.println(" time for 2000L - " + v.workTime(2000) + " hours");
        }
    }
}
