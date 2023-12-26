package org.example.homework;

public class Programming {
    /*Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages"
    should be printed. If some String is passed to it, then in place of "programming
    languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
     */
    private String str;

    public Programming(){
        this.str = "programming language";
    }
    public Programming(String str){
        this.str = str;
    }
    void printText(){
        System.out.println("I love " + str);
    }

    public static void main(String[] args) {
        Programming p1 = new Programming();
        p1.printText();
        Programming p2 = new Programming("Java");
        p2.printText();
    }
}
