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
import java.util.Scanner;

public class LibraryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library(10);
    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Display available books");
        System.out.println("2. Add a book");
        System.out.println("3. Borrow a book");
        System.out.println("4. Return a book");
        System.out.println("5. Search for a book");
        System.out.println("6. Display borrowed books");
        System.out.println("7. Exit");
        System.out.print("Please enter your choice > "); 
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        switch (choice) {
            case 1:
                library.displayBooks();
                break;
            case 2:
                System.out.print("Enter the title of the book to add: ");
                String newTitle = scanner.nextLine();
                library.addBook(newTitle);
                System.out.println("You added: " + newTitle); // Confirmation message
                break;
            case 3:
                System.out.print("Enter the title of the book to borrow: ");
                String borrowTitle = scanner.nextLine();
                library.borrowBook(borrowTitle);
                break;
            case 4:
                System.out.print("Enter the title of the book to return: ");
                String returnTitle = scanner.nextLine();
                library.returnBook(returnTitle);
                break;
            case 5:
                System.out.print("Enter the title of the book to search: ");
                String searchTitle = scanner.nextLine();
                library.searchBook(searchTitle);
                break;
            case 6:
                library.displayBorrowedBooks();
                break;   
            case 7:
                System.out.println("Exiting...");
                scanner.close();
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
