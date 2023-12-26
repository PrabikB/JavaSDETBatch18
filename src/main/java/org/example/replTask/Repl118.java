package org.example.replTask;

public class Repl118 {
    /*Write a method header on line two with the following specs:
Returns:
a String
Name:
spaceOut
Parameters:
a String
Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).
Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
     */

    public static String spaceOut(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i) + " ";
        }
        str += " ";
        return str;
    }

    public static void main(String[] args) {
        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));
    }
}
