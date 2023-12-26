package org.example.class4;

import java.util.Scanner;

public class Task4Scanner {
    public static void main(String[] args) {

/*Create a Java program that will ask if user has a credit card or not.
If your user does not have a credit card then offer them.
If they do have one ask what is balance on the card?
If balance of the card is larger than 1000, tell them to pay off immediately,
otherwise you can tell them that they can spend more.
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String hasCreditCard = sc.nextLine();

        if (hasCreditCard.equals("Yes")) {
            System.out.println("What is balance on the card?");
            int payOffBalance=sc.nextInt();

            if(payOffBalance>1000){
                System.out.println("You need to pay off immediately.");
            }else{
                System.out.println("You can spend more.");
            }

        }else{
                System.out.println("You need to apply for credit card.");
            }


    }
}