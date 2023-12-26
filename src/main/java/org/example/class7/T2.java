package org.example.class7;

public class T2 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 44, 33, 56};
        int sum = 0;

        //modify this code to add all of the numbers from array
        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];;

        }
        System.out.println(sum);

    }
}