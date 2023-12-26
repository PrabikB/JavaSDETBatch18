package org.example.homework;

public class Book {
    /* Library Management System:
Create a base class Book with attributes like title, author, and ISBN.
Develop two subclasses: EBook and PrintBook. In EBook, add a property for download_link,
and in PrintBook, add a property for number_of_copies.
Implement a method in each subclass that displays book details.
Instantiate objects from these classes and demonstrate the display functionality.
     */
    private String title;
    String author;
    String ISBN;

    public Book(String title,String author,String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void bookDetails(){
        System.out.println("The name of the book is "+title+". The author of this book is "+author+". ISBN "+ISBN);
    }
}
class Ebook extends Book{
    private String downloadLink;
    public Ebook(String title, String author, String ISBN,String downloadLink) {
        super(title, author, ISBN);
        this.downloadLink = downloadLink;
    }

    @Override
    public void bookDetails() {
        super.bookDetails();
        System.out.println("Click on download link to view details of the book "+downloadLink);
    }
}
class PrintBook extends Book{
    private int numberOfCopies;
    public PrintBook(String title, String author, String ISBN,int numberOfCopies) {
        super(title, author, ISBN);
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public void bookDetails() {
        super.bookDetails();
        System.out.println("Over " +numberOfCopies+ " millions copies sold worldwide");
    }
}
