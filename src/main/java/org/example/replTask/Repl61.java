package org.example.replTask;

public class Repl61 {
/*Write a program that uses for loop to prints multiplication of
number 3 from 1 to 10
 */
    public static void main(String[] args) {

        int num = 3;
        for (int i =1; i<=10; i++){
            int result = num*i;
            System.out.println(num+"*"+i+"="+result);
        }

    }
}
