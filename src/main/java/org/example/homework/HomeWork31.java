package org.example.homework;

public class HomeWork31 {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    public static  String overloaded(String str){
        return str;
    }
    public static int overloaded(int num){
        return num;
    }
    public static double overloaded(double num){
        return num;
    }

    public static void main(String[] args) {
        String s = overloaded("Java");
        System.out.println(s);

        int n = overloaded(2);
        System.out.println("Current Version " + n);

        double d = overloaded(2.5);
        System.out.println("Update Version " + d);
    }
}
