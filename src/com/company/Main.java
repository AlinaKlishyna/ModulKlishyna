package com.company;

public class Main {

    public static void main(String[] args) {

        Person student = new Student("Аліна",4);
        Person teacher = new Teacher("Володимир",28);
        Person dean = new Dean("Алексей",49);

        Scientist[] scientists = new Scientist[]{student,teacher,dean};
        for (Scientist temp :scientists) {
            for (int i = 1; i<11;i++){
                if(temp == student){
                    System.out.println(student +" №:"+ i);
                    temp.learn();
                    temp.toTeach();
                }
            }

            if(temp == dean){
                System.out.println(dean);
                temp.learn();
                temp.toTeach();
            }
            for (int i = 1; i <3 ; i++){
                if(temp == teacher){
                    System.out.println(teacher +" №:"+ i);
                    temp.learn();
                    temp.toTeach();
                }
            }


        }
    }
}
