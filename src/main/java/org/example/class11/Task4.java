package org.example.class11;

public class Task4 {
    /* Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String.
For Example String str=hello => l
     */
    public static void main(String[] args) {

         String str = "Computers";

        if(!str.isEmpty()){
            int len=str.length();
            if(len>=3&& len%2!=0) {
                System.out.println(str);
                System.out.println(str.charAt(len / 2));

            }
         }

    }

}
