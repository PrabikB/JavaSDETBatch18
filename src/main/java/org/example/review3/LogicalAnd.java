package org.example.review3;

public class LogicalAnd {

    // for && : all condition needs to be true
    public static void main(String[] args) {

        boolean rain = true;
        boolean cold = true;

    if(cold &&rain){
        System.out.println("I am stayig home");
    }
    boolean messageDisplayed = true;
    String errorMessage = "Invalid credentials";

    if (messageDisplayed && errorMessage.equals("Invalid Credentials")){
        System.out.println("Test Case passed");

    }else{
        System.out.println("Test Case faild");
    }

    }
}
