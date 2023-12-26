package org.example.class8;

import java.util.Scanner;

public class E5ScannerAndArray {
    public static void main(String[] args) {

        int[]numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<numbers.length; i++){
            System.out.println("Please enter a number");
            numbers[i]=sc.nextInt();
        }
        System.out.println("Here are all the numbers that you entered");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
