package org.example.homework;

public class HomeWork18 {
    // From an array of integer elements find the largest number.

    public static void main(String[] args) {

        int[] num= {10,20,30,40,50};
        int largestNum=num[0];

        for(int i =0; i<num.length;i++){
            if(largestNum<num[i]){
                largestNum=num[i];
            }
        }
        System.out.println("The largest number from an array of integer is "+largestNum);

    }
}
