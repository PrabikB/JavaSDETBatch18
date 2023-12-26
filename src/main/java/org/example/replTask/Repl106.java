package org.example.replTask;

public class Repl106 {
    /*Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
**Expected Output:**
HELLO WORLD
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb.toString().toUpperCase());
    }
}
