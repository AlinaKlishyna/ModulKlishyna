package com.company;

public class Teacher extends Person {

    public Teacher() { }
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("Я вчитель! Я вже вивчився!");
    }
}
