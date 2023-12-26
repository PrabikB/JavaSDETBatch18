package org.example.replTask;

public class Repl99 {
    /*Write code that will take in a String input and check to see if it is a palindrome or not.
A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
Examples of palindromes:
- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star
Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
Your program will print out "true" if it's a palindrome and "false" if not.
     */
    public static void main(String[] args) {
        String word = "was it a car or a cat I saw";
        boolean isPalindrome = true;
        String str = word.replaceAll(" ","").toLowerCase();

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
