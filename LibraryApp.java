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
    
    Library library = new Library(10);
    while (true) {        
        int choice =  Validator.inputInt("========MANAGER LIBRARY==========\n"
                    + "1. Add a book to the library.\n"
                    + "2. Display all books in the library.\n"
                    + "3. Borrow a book from the library.\n"
                    + "4. Display the list of borrowed books\n"
                    + "5. Return borrowed book to the library\n"
                    + "6. Search for a book in the library\n"
                    + "7. Exit\n"
                    + "Enter your choice : ", "Just be 1->7", "Invalid!", 1, 7);
        
        switch (choice) {
            case 1:
                library.displayBooks();
                break;
            case 2:
                String newTitle = Validator.inputString("Enter title: ", "title can not empty!", "^(?!\\s*$).+");
                library.addBook(newTitle);
                System.out.println("You added: " + newTitle); // Confirmation message
                break;
            case 3:
                String borrowTitle = Validator.inputString("Enter title: ", "title can not empty!", "^(?!\\s*$).+");
                library.borrowBook(borrowTitle);
                break;
            case 4:
                String borrowTitle = Validator.inputString("Enter title: ", "title can not empty!", "^(?!\\s*$).+");
                library.returnBook(returnTitle);
                break;
            case 5:
                String searchTitle = Validator.inputString("Enter title: ", "title can not empty!", "^(?!\\s*$).+");
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
