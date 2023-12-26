package org.example.homework;

public class HomeWork30{
    /*Create a method to find the minimum of two numbers.
Method will be passed two parameters and will return the minimum number.
Method should work with int and double data types.
Examples
min(10,5)=>5
min(2.5,3.5)=>2.5
     */
    public static int min(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static double min(double num1, double num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(5,10));
        System.out.println(min(20.5,30.5));
    }
}
