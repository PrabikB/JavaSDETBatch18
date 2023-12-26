package org.example.class11;

public class E1StringDemo {
    public static void main(String[] args) {

        //Create the object of that class
        /*
        String => data type
        str => variable name
        new string() => creating the object of the string
         */
        String str = new String("Hello World");
           // calling the length method using the str object
        System.out.println(str.length());
          // converts all charecter to upper case
        System.out.println(str.toUpperCase());
        String upper = str.toUpperCase();
        System.out.println(upper);
          // converts all charecter to lower case
        System.out.println(str.toLowerCase());
          //
        System.out.println(str+" Hello Batch 18");


    }
}
