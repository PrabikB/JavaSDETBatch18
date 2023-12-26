package org.example.class8;

public class E2Array {
    public static void main(String[] args) {

        int [] num={10,20,30,40,45,55,25,80,90};
        //add all the even numbers from the avove array

        int sum =0;
        for(int i = 0; i<num.length; i++){
        if(num[i]%2==0) {
            sum = sum + num[i];
        }
        }
        System.out.println(sum);

    }
}
