package org.example.class4;

public class DonorT1 {
    public static void main(String[] args) {

        int age = 20;
        int weight = 175;
        if (age >= 18) {
            if (weight>=110){
                System.out.println("You are eligible for blood donation");
            }else{
                System.out.println("You are not eligible for a blood donation");
            }

        }else{
            System.out.println("We cannot accept such patient");
        }
    }
}