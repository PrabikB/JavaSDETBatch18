package org.example.homework;

public class HomeWork16 {
    /* Create an array of animals and store 5 elements into it.
    Using 2 different loops print all elements from the array.
     */
    public static void main(String[] args) {
        String[] animals={"Cat", "Dog", "Lion", "Horse", "Elephant" };

        for(int i =0; i<animals.length; i++){
            System.out.print(animals[i]+" ");
        }
        System.out.println();

        int i = 0;

        do{
            System.out.print(animals[i]+" ");
            i++;
        }while(i<animals.length);

    }
}
