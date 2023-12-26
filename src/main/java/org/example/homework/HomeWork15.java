package org.example.homework;

public class HomeWork15 {
    /* Create an array of cars and store 6 elements into it.
       Using 2 different loops print all values from the array.
     */
    public static void main(String[] args) {

        String[] cars = {"Toyota", "Lexus", "Honda", "Acura", "Ford", "Lincoln"};

        for(int i = 0; i<cars.length; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();

        int i = 0;
        while(i<cars.length){
            System.out.print(cars[i]+" ");
            i++;
        }

    }
}
