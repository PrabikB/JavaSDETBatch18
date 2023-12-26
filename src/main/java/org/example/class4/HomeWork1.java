package org.example.class4;

public class HomeWork1 {

    public static void main(String[] args) {

        double num1 = 9000;
        double num2 = 10000;
        double num3 = 3000;

        if (num1 > num2) {

            if (num1 > num3) {
                System.out.println("Num1 is largest");
            }

        } else {
            if (num2 > num3) {
                System.out.println("Number2 is largest");
            } else {
                System.out.println("Number3 is largest");
            }
        }
    }
}