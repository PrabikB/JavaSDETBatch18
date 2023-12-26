package org.example.homework;

public class HomeWork26 {
    //Write a method to return whether given number is prime or not?
    void isPrime(int num) {
        int count =0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not Prime number");
            }
        } else {
            System.out.println("Not Prime number");
        }
    }

    public static void main(String[] args) {
        HomeWork26 p = new HomeWork26();
        p.isPrime(13);
    }
}
