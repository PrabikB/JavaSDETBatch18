package org.example.class7;

public class E10Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 32, 56, 67, 54, 33, 3, 9};
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}