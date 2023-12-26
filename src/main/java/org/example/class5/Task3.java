package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter current time");
        int time=sc.nextInt();

        if(time>1 && time<=11){
            System.out.println("It is morning");
        }else if(time>=12 && time<=15){
            System.out.println("It is afternoon");
        }else if(time>=16 && time<=20){
            System.out.println("It is Evening");
        }else if(time>=21 && time<=24){
            System.out.println("It is night");
        }else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}
