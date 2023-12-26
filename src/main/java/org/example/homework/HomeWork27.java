package org.example.homework;

public class HomeWork27 {
    /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    public static String word(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        return str;
    }
    public static void main(String[] args) {
        HomeWork27 rWord = new HomeWork27();
        rWord.word("Syntax Technologies");
    }
}
