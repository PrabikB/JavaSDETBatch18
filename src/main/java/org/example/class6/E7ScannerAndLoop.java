package org.example.class6;

import java.util.Scanner;

public class E7ScannerAndLoop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start = sc.nextInt();
        System.out.println("Please enter the ending point");
        int end = sc.nextInt();
        System.out.println("Please enter the step size as well");
        int step=sc.nextInt();
        while(start<=end){
            System.out.print(start+ " ");
            start=start+step;
        }
    }
}
