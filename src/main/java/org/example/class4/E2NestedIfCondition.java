package org.example.class4;

public class E2NestedIfCondition {
    public static void main(String[] args) {

        double budget = 25000;
        String engineType = "Petrol";
        if (budget >= 50000) {

            if (engineType.equals("Electric")) {
                System.out.println("I want to buy a tesla");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy a Toyota");
            } else {
                System.out.println("I want to buy a Porche");
            }
            }else if (budget >= 30000) {
            if (engineType.equals("Electric")) {
                System.out.println("I want to buy BYD");
            } else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy Camry");
            } else {
                System.out.println("Hyudai Sinata");
            }
        }else if(budget>=20000){
            if(engineType.equals("Electric")){
                System.out.println("nissan leaf");
            }else if(engineType.equals("Hybrid")){
                System.out.println("Kia");
            }else{
                System.out.println("honda civic");
            }
        }else{
            System.out.println("Let's save more");
        }
    }
}

