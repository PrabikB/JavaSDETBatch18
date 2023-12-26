package org.example.class15;

public class Book {
    private String bName;
    private int noOfPages;
    private String author;
    private String language;
    private String size;
    public Book(String bName,int noOfPages,String author,String language){
        this.bName = bName;
        this.noOfPages = noOfPages;
        this.author = author;
        this.language = language;
    }
    public Book(String bName,int noOfPages,String author, String language, String size){
        this(bName,noOfPages,author,language);
        this.size = size;
    }
    public void printInfo(){
        System.out.println(bName+" "+noOfPages+" "+author);
    }
    public static void main(String[] args) {
        Book b = new Book("The Alchemist",163,"Paulo Coelho","English","Thin");
        b.printInfo();
    }





}
