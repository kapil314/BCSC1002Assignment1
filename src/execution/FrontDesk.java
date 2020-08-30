/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issued book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Book name :");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter author name :");
                    String bookAuthorName = scanner.nextLine();
                    System.out.println("Enter ISBN number off Book :");
                    String bookISBNNumber = scanner.nextLine();
                    Book book = new Book(bookName, bookAuthorName, bookISBNNumber);
                    student.issueBook(book);
                    break;
                case 2:
                    System.out.println("Enter the name of the book you want to return :");
                    String returnBookName = scanner.nextLine();
                    student.returnPreviouslyIssuedBook(returnBookName);
                    break;
                case 3:
                    student.showAllBooks();
                    break;
                default:
                    System.out.println("You have chosen to Exit.");
                    break;
            }
        } while (choice != 4);

    }
}
