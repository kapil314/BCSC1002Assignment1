/*  Created by IntelliJ IDEA.
 *  User: Kapil Jadaun
 *  Date: 30/08/20
 *  Time: 21:52
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] currentlyAvailableBooks;

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

}
