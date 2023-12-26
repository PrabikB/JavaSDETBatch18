package org.example.replTask;

public class Repl123 {
    /*  Declare the **instance** variables to hold:
- integer values
- String values
- double values
- boolean values
- float values
Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.
**Expected Output:**
0
null
0.0
false
0.0
 */
    int iValue;
    String sValue;
    double dValue;
    boolean bValue;
    float fValue;

    public static void main(String[] args) {
        Repl123 value = new Repl123();
        System.out.println(value.iValue);
        System.out.println(value.sValue);
        System.out.println(value.dValue);
        System.out.println(value.bValue);
        System.out.println(value.fValue);


    }
}
