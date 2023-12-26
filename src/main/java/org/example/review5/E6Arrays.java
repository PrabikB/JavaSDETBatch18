package org.example.review5;

public class E6Arrays {
    public static void main(String[] args) {
        int [] numbers = {10,25,36,56,80};

        //iter
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println();

        // fori
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");


        }
    }
}
