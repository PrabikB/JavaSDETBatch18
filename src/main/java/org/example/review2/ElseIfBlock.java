package org.example.review2;

public class ElseIfBlock {
    public static void main(String[] args) {

        int worldCup=2010;

        if(worldCup==2002){
            System.out.println("Host country is Korea and Japan");
        } else if (worldCup==2006){
            System.out.println("Host country is Germany");
        } else if (worldCup==2010){
            System.out.println("Host country is South Africa");
        } else if (worldCup==2014){
            System.out.println("Host country is Brazil");
        } else{ //otherwise
            System.out.println("Host country is unknown");
        }



    }
}
/*
        if(condition) {};

        if (condition) {
        code execute;
        } else{
        code execute;
        }

        //when we have multiple conditions to test

        if(condition){
        code execute;
        }else if{
        code execute:
        }else if{
        code execute;
        }
         */