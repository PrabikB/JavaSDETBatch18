package org.example.homework;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Ebook eBook = new Ebook("Atomic Habits","James Clear","978-0-73521-129-2",
                "https://www.audible.com/pd/Atomic-Habits-Audiobook/1524779261");
        eBook.bookDetails();
        System.out.println("**************");
        PrintBook pBook = new PrintBook("Atomic Habits","James Clear","978-1-84794-184-8",15);
        pBook.bookDetails();
    }
}
