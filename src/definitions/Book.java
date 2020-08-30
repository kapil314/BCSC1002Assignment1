/*  Created by IntelliJ IDEA.
 *  User: Kapil Jadaun
 *  Date: 30/08/20
 *  Time: 21:17
 *  File Name : Book.java
 * */
package definitions;

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

    public Book(String bookName, String bookAuthorName, String bookISBNumber) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getBookISBNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNumber(String bookISBNumber) {
        this.bookISBNNumber = bookISBNumber;
    }


}
