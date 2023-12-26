package org.example.class9;

public class task6 {
    /*
Create 2D array of cars : american, german, korean, italian.
 Then retrieve all values from that array using 2 different loops
 */
    public static void main(String[] args) {
        String[][] cars = {{"Ford", "Dodge", "Cadilac"},
                {"BMW", "Mercedes", "Audi"},
                {"Hyndai", "Kia", "Genesis"},
                {"Ferrari", "Lambo", "Alfa Romeo"}
        };

        for(int i = 0; i<cars.length;i++){
            for(int j =0; j< cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Using Enhanced For Loop");
        System.out.println();
        for(String[] arr:cars) {
            for (String car : arr) {
                System.out.print(car + " ");
            }
            System.out.println();
        }


    }
}