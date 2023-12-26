package org.example.replTask;

import java.util.Scanner;

public class Repl78 {
/*Create an int array of integers with a size of 5 and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] num = new int[5];

    for(int i= 0; i<5; i++){
        num[i] = sc.nextInt();
    }
    for(int i =0; i<5; i++){
        System.out.println(num[i]*10);
    }
}
}
