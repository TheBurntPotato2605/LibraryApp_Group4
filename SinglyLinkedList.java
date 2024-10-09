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
public class SinglyLinkedList {
    private Node head;    
    public void borrowBook(String title) {
        Node newNode = new Node(title);  
        newNode.next = head; 
        head = newNode;    
    }    
    public boolean returnBook(String title) {
        Node current = head;
        int count = 0;
        Node previous =  null;
        while (current != null) {
            if (current.title.equals(title)) {
                if (count == 0) {
                    head = head.next; 
                } else {    
                    previous.next = current.next; 
                }
             
                return true;
            }
            previous = current;
            count++;
            current = current.next;
        }
        return false; 
    }    
    public void displayBorrowedBooks() {
        Node current = head;
        if (current == null) {
            System.out.println("No books borrowed.");
            return;
        }
        System.out.println("Borrowed Books:");
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
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
}
