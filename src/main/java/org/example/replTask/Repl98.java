package org.example.replTask;

public class Repl98 {
    /*Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
**Expected Output:**
Welcome Syntax family
     */
    public static void main(String[] args) {
        String given = "Hello Syntax friends";
        String change = "Welcome Syntax family";
        System.out.println(given.replaceAll(given,change));
    }
}
