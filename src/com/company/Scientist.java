package com.company;

public interface Scientist {
     default void toTeach(){
         System.out.println("Я вже вивчився!");
     }; //вчити
    default void toTeach(String subjects) { //вчити
        System.out.println("Я вже вивчився!");
    }

      void learn();//вчитися


}