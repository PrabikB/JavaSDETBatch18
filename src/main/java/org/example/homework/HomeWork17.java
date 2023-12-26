package org.example.homework;

public class HomeWork17 {
    // Create an array on integers and calculate the sum of all elements in an array

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for(int i = 0; i<9; i++) {
            sum = sum+num[i];

        }
        System.out.println("The sum of all elements in an array is "+sum);

    }

}
