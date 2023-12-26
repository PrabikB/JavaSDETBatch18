package org.example.class13;

public class T1SamePage {
    public static void main(String[] args) {
        T1SamePage largerN = new T1SamePage();
        largerN.largenum(10,7);

    }
    void largenum(int num1,int num2){
        if (num1>num2){
            System.out.println("It is a larger num");
        }else{
            System.out.println("It is not a larger");
        }
    }
}
