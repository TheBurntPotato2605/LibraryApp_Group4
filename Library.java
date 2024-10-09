/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryapp;

/**
 *
 * @author hieupc
 */
import java.io.*;

class Library {
    private Node head;
    private String[] books;
    private SinglyLinkedList borrowedBooks;
    private int count;
    public Library(int size) {
        books = new String[size];
        borrowedBooks = new SinglyLinkedList();
        count = 0;
    }
    public void addBook(String title) {
        if (count < books.length) {
            books[count++] = title;
        } else {
            System.out.println("Library is full!");
        }
    }
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No available books.");
        } else {
            System.out.println("Available Books:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
    public boolean contains(String title) {
        Node current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void borrowBook(String title) {
        if (borrowedBooks.contains(title)) {
            System.out.println("This book is already borrowed.");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (books[i].equals(title)) {

                books[i] = books[count - 1];
                count--;
                borrowedBooks.borrowBook(title);
                System.out.println("You borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not found in library.");
    }
    public boolean returnBook(String title) {
        boolean returned = borrowedBooks.returnBook(title);
        if (returned) {
            addBook(title);
            System.out.println("You returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
        return returned;
    }
    public void searchBook(String title) {

        for (int i = 0; i < count; i++) {
            if (books[i].equals(title)) {
                System.out.println("The book is available.");
                return;
            }
        }
        if (borrowedBooks.contains(title)) {
            System.out.println("The book is borrowed.");
        } else {
            System.out.println("The book is not in the library.");
        }
    }
    public void displayBorrowedBooks() {
        borrowedBooks.displayBorrowedBooks(); 
    }
    public SinglyLinkedList getBorrowedBooks() {
        return borrowedBooks;
    }

}
