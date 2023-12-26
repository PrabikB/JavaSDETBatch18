package org.example.projectTask;

public class SecondLargestNumber {
    // Write a java program to find the second largest number in the array
    public static void main(String[] args) {
        int [] num = {4,7,2,32,44,50};

        int largestNum = 0;
        int secondLargestNum = 0;

        for(int n : num){
            if ( n>largestNum){
                secondLargestNum = largestNum;
                largestNum = n;
            }else if (n > secondLargestNum && n !=largestNum){
                secondLargestNum = n;
            }
        }
        System.out.println("The second largest number in the array is: " +secondLargestNum);
    }
}
