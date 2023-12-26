package org.example.projectTask;

public class SumOfElements {
    /* Create an array of integer values. After the array is created,
       calculate the sum of all stored elements in that array.
     */
    public static void main(String[] args) {
        int [] numbers = {13, 29, 3, 48, 91, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("The sum of all stored elements in the array is " +sum);
    }
}
