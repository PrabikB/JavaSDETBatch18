package org.example.homework;

import java.util.Scanner;

public class HomeWork7 {
    /*Using scanner class create calculator. Allow user to enter 2
    numbers and operator(+,-,*,/). Based on operator provide the result to user.
    Please complete this assignment in 2 ways: using if statement and switch case.
     */
    //using if statement
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number");
        double num1 = sc.nextDouble();

        System.out.println("Please choose the operator(+,-,*,/)");
        char operator = sc.next().charAt(0);

        System.out.println("Please enter your second number");
        double num2 = sc.nextDouble();
        double result = 0;

        if (operator == '+'){
            result = num1+num1;
        }else if (operator == '-'){
            result = num1-num2;
        }else if (operator == '*'){
            result = num1*num2;
        }else if (operator == '/'){
            result = num1/num2;
        }
        System.out.println("The result of two number is " +result);


    }
}
