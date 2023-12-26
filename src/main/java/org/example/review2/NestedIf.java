package org.example.review2;

public class NestedIf {
    public static void main(String[] args) {

        //nested if -> if statement inside another if
        /*
        if (condition){
            if(condition){
            }
        }
         */

        boolean allergy=true;
        String allergyType="peanut";

        if(allergy){ //outer if
            System.out.println("Let's check what kind of allergy you have");

            if(allergyType.equals("peanut")){ //nested if
                System.out.println("Please avoid food that contains peanut");
            }
        }

    }
}
