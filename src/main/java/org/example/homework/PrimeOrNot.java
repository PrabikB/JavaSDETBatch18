package org.example.homework;

public class PrimeOrNot {
    //Write a method to return whether given number is prime or not?
    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <=num / 2; i++){
            if (num %i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeOrNot number = new PrimeOrNot();
        int n = 4;

        if(number.isPrime(n)){
            System.out.println(n+ " is a Prime number");
        }else{
            System.out.println(n+ " is not a prime number");
        }
    }
}
