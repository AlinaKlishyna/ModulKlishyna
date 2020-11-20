package com.company;

public class Student extends Person {
    public Student() {
    }
    public Student(String name, int age) {
        super(name, age);
    }


    @Override
    public void toTeach(String subject) {
        System.out.println("Я вивчаю предмет: " + subject);
    }

    @Override
    public void learn() {
        System.out.println("Я студент! Я навчаюсь!");
    }
}
