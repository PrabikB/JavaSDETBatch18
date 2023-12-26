package org.example.replTask;

public class Repl121 {
    /*  declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
**Expected Output:**
10
10.23
a
100
100.23
s
     */
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        Repl121 i1 = new Repl121();
        i1.intValue = 10;
        i1.doubleValue = 10.23;
        i1.charValue = 'a';

        System.out.println(i1.intValue);
        System.out.println(i1.doubleValue);
        System.out.println(i1.charValue);

        Repl121 i2 = new Repl121();
        i2.intValue = 100;
        i2.doubleValue = 100.23;
        i2.charValue = 's';

        System.out.println(i2.intValue);
        System.out.println(i2.doubleValue);
        System.out.println(i2.charValue);
    }
}
