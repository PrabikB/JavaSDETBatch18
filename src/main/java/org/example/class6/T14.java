package org.example.class6;

public class T14 {
    //print even numbers from 20 to 1(using 2 different loops)
    public static void main(String[] args) {
        for(int i = 20; i>=1; i= i-2){
            System.out.print(i+" ");
        }
        System.out.println();
        int a = 20;
        do{
            System.out.print(a+" ");
            a= a-2;
        }while(a>=1);
    }
}
