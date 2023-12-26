package org.example.homework;

public class HomeWork29 {
    /*Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    private void overloaded(String a){
        System.out.println(a);
    }
    private void overloaded(int num){
        System.out.println("Batch "+num);
    }
    private void overloaded(double num){
        System.out.println("I have been learning SDET for over "+num+ " month");
    }

    public static void main(String[] args) {
        HomeWork29 hw = new HomeWork29();
        hw.overloaded("Syntax Technologies ");
        hw.overloaded(18);
        hw.overloaded(1.5);
    }
}

