package org.example.review3;

public class LogicalOr {
    // for || logical operator at least one condition needs to be true
    public static void main(String[] args) {

        boolean rain = false;
        boolean cold = true;

        if(cold || rain){
            System.out.println("I am stayig home");
        }

        String welcomeMessage = "Welcome Admin";
        boolean dashboardFormDisplayed = false;

        if (welcomeMessage.equals("Welcome Admin") || dashboardFormDisplayed){
            System.out.println("Admin user is succesfulluy logged in");

        }else{
            System.out.println("Cannot login using admin credentials");
        }

    }
}
