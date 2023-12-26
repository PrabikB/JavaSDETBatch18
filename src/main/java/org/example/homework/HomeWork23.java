package org.example.homework;

public class HomeWork23 {
    public static void main(String[] args) {
        String word1 = "Day";
        String word2 = "Night";
        System.out.println("Befor swaping the word : ");
        System.out.println(word1);
        System.out.println(word2);

        word1 = word1 + word2;
        word2 = word1.substring(0,word1.length()-word2.length());
        word1 = word1.substring(word2.length());
        System.out.println();
        System.out.println("After swaping the word : ");
        System.out.println(word1);
        System.out.println(word2);
    }
}
