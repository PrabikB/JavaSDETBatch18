package org.example.class8;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 18, 9, 60, 22, 30};
        //int[]numbers = {9,10,15,18,20,22,30,60};
        boolean isSorted = true;
        for (int n = 0; n < numbers.length - 1; n++) {
            if (numbers[n] > numbers[n + 1]) {
                isSorted = false;
                break;
            }
        }
            System.out.println("Is number sorted?: "+isSorted);

    }
}