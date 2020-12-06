package com.company;

public class Dean extends Person{

    public Dean() { }

    public Dean(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("Я декан! Я вчився ще років 10 назад!");
    }
}
