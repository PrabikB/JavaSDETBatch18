package org.example.calculator;

public class Prac {
    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw";
        boolean isPalindrome = true;

        // Remove spaces and convert to lowercase
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();


        // Check if the cleaned string is a palindrome
        for (int i = 0; i < cleanedInput.length() / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - 1 - i)) {
                isPalindrome = false; // Characters don't match, not a palindrome
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
