package com.company;

public interface Scientist {
     default void toTeach(){ //вчити
         System.out.println("Я вже вивчився!");
     }; 
    default void toTeach(String subjects) { //вчити
        System.out.println("Я вже вивчився!");
    }

      void learn();//вчитися


}
