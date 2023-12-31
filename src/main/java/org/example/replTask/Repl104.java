package org.example.replTask;

import java.util.Scanner;

public class Repl104 {
    /*Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
**Joh**
**Jan**
**Jim**
**Mik**
**Emi**
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
            System.out.println(i);
        }
        for(String name:names){
            System.out.println(name.substring(0,3));
        }
    }
}
