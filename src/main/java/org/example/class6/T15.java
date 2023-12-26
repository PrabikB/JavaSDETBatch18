package org.example.class6;

public class T15 {
    //print odd numbers between 20 to 50 using 2 differnet loop

    public static void main(String[] args) {
        for(int i=20; i<=50;  i++){
            if(i%2!=0)
            System.out.print(i+" ");
        }
        System.out.println();
        int i = 20;
        while(i<=50){
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }




    }
}
