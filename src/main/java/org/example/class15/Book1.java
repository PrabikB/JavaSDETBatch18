package org.example.class15;

public class Book1 {
    private String title;
    private String author;
    private int noOfPages;
    private String publisher;
    private double price;

    public Book1(String title, String author, int noOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.publisher = publisher;

    }

    public Book1(String title, String author, int noOfPages, String publisher, double price) {
        this(title, author, noOfPages, publisher);
        this.price = price;
    }

    public void printInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher);
    }

    public void printAllInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher+" "+price);
    }

    public static void main(String[] args) {
        new  Book1("Harry Jutt","Mola Jutt",1000,"Urdu",120).printInfo();
        new  Book1("Harry Jutt","Mola Jutt",1000,"Urdu").printInfo();
    }
}

