package org.example.replTask;

public class Repl139 {
    /* Create a method that will be available to all classes in your project with following specifications:
Returns:
a boolean
Name:
alphabetical
Parameters:
char c1 char c2
Purpose:
Return true if the c1 apears first in Alphabetical ordre
'a' , 'b' ==> True
'a' < 'a' ==> False
'b' , 'a' ==> False
Examples:
alphabetical('a','b') ==> true
alphabetical('d','z') ==> true
alphabetical('z','x') ==> false
     */
    public static boolean alphabetical(char c1, char c2){
        return c1 < c2;
    }

    public static void main(String[] args) {
        System.out.println(alphabetical('a','b'));
        System.out.println(alphabetical('a','a'));
        System.out.println(alphabetical('b','a'));
    }
}
