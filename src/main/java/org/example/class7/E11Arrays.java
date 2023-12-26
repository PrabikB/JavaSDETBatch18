package org.example.class7;

public class E11Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 32, 56, 67, 54, 32, 3, 9};
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++){

            if(numbers[i]==32){
                System.out.println("The number is found");
                break;
            }
        }

    }
}
