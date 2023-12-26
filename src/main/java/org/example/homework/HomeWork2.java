package org.example.homework;

public class HomeWork2 {
    /* Create a Java program and store values of mortgage rate and mortgage price.
    First, program should check if rate is higher than 4.5 user will not buy a house,
    otherwise user will consider buying. Once user decides to buy a house, if price of
    the house is larger than 100,000 than user will take a loan, otherwise user will pay cash.
     */

    public static void main(String[] args) {

        float mortgageRate= 3.5f;
        int mortgagePrice=750000;

        if(mortgageRate<4.5){
            System.out.println("I am buying this house");

            if(mortgagePrice>100000){
                System.out.println("I will consider taking loan to buy this house");
            }else{
                System.out.println("I will be paying a cash");
            }

        } else {
            System.out.println("I am not buying this house");
        }

        }
}
