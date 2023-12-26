package org.example.class5;

public class E4LogicalOperators {
    public static void main(String[] args) {

        boolean bringFlower=false;
        boolean bringChocolates=false;
        boolean allMyMistake=false;

        if(bringFlower||bringChocolates||allMyMistake){
            System.out.println("Wife is happy");
        }else{
            System.out.println("Wife is still angry");
        }
    }
}
