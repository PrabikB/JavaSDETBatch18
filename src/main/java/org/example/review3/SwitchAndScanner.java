package org.example.review3;

import java.util.Scanner;

public class SwitchAndScanner {
    public static void main(String[] args) {
        /*
    Ask user where he is from and based on the country specify favourite food
     */

        Scanner capture= new Scanner(System.in);
        System.out.println("Please enter where are you from");
        String country=capture.nextLine();

        switch(country.toLowerCase()){
            case "india":
                System.out.println("You love biryani");
                break;
            case "egypt":
                System.out.println("You love Koshary");
                break;
            case "georgia":
                System.out.println("You love Hachapuri");
                break;
            case "moldova":
                System.out.println("You love Mamaliga");
                break;
            case "kazakastan":
                System.out.println("You love Beshparmak");
                break;
            case "usa":
                System.out.println("You love Pizza");
                break;
            case "great britian":
                System.out.println("You love fish and chips");
                break;
            case "nepal":
                System.out.println("You love Mo:Mo");
                break;
            default:
                System.out.println(" I don't know your favourite food ");
        }


    }


}
