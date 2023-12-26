package org.example.calculator;
import java.util.Scanner;


public class MakeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Simple Calculator:");
        System.out.println("Available Operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (_)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.println("Enter your choice (1/2/3/4): ");
        int choice=scanner.nextInt();

        System.out.println("Enter the first number: ");
        double num1= scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2= scanner.nextDouble();

        double result = 0;

        switch (choice)  {
            case 1:
            result = num1+num2;
            break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                result = num1*num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1/num2;

                } else {
                    System.out.println("Error: Division by 0 is not allowed.");
                return;

                }
                break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            return;


        }
        System.out.println("Result: "+ result);
        scanner.close();


    }
}
