/*  Created by IntelliJ IDEA.
 *  User: Kapil Jadaun
 *  Date: 30/08/20
 *  Time: 21:17
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String bookISBNNumber;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public Book(String bookName, String bookAuthorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookISBNNumber='" + bookISBNNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookAuthorName, book.bookAuthorName) &&
                Objects.equals(bookISBNNumber, book.bookISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthorName, bookISBNNumber);
    }
}
