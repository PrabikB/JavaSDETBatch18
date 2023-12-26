package org.example.homework;

import java.util.Scanner;

public class HomeWork8 {
    /*Using scanner class create calculator. Allow user to enter 2
    numbers and operator(+,-,*,/). Based on operator provide the result to user.
    Please complete this assignment in 2 ways: using if statement and switch case.
     */
    //Using switch case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        double num1 = sc.nextInt();

        System.out.println("Please select operator(+,-,*,/)");
        char operator = sc.next().charAt(0);

        System.out.println("Please enter second number:");
        double num2 = sc.nextDouble();

        double result = 0;

        switch(operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;

        }
        System.out.println("The result of two number is "+result);




    }
}
