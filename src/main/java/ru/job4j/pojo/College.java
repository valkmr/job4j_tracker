package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Valerii Komar");
        student.setGroup("Intern");
        student.setDate(new Date(1671044160000L));
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
        System.out.println(student.getDate());
    }
}
