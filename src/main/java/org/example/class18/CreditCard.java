package org.example.class18;
/*Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */
public class CreditCard {
   void calculateInterest(double amount){
        double interest = amount*0.05;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class Visa extends CreditCard{
    @Override
    void calculateInterest(double amount){
        double interest = amount * 0.07;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}
class AX extends CreditCard{
    @Override
    void calculateInterest(double amount){
        double interest = amount * 0.09;
        System.out.println("Interest rate on "+amount+" is "+interest);
    }
}
class CreditCardTester{
    public static void main(String[] args) {

        AX ax = new AX();
        ax.calculateInterest(15000);
        Visa v = new Visa();
        v.calculateInterest(25000);
    }
}
