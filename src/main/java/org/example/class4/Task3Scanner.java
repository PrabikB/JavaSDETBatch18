package org.example.class4;

import java.util.Scanner;

public class Task3Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your city");
        String cityName= sc.nextLine();
        System.out.println("Please enter the temperature");
        double temp=sc.nextDouble();
        double tempInCelsius=(temp-32)*5.0/9.0;
        System.out.println("The temperature of the city " +cityName+ " is "+tempInCelsius+"c");


    }

}
