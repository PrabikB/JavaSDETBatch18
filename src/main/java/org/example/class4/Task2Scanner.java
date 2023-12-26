package org.example.class4;

import java.util.Scanner;

public class Task2Scanner {
    public static void main(String[] args) {
        /*
    You are DMV representative and you need to ask customer their age.
    If they are 18 or older you will issue a driver license to them,
    otherwise you will offer them to get a learners permit.
     */

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter you age");
        int age=sc.nextInt();

        if (age>=18){
            System.out.println("I will issue a driver liscence");
        }else{
            System.out.println("you need to get a learners perrmit");
        }



    }
}
