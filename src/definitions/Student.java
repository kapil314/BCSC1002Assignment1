/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentName;
    private long universityRollNo;
    private int numberOfBooksIssuedByStudent;
    private Book[] nameOfBooksIssuedByStudent;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNo = universityRollNo;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getNameOfBooksIssuedByStudent() {
        return nameOfBooksIssuedByStudent;
    }

    public void setNameOfBooksIssuedByStudent(Book[] nameOfBooksIssuedByStudent) {
        this.nameOfBooksIssuedByStudent = nameOfBooksIssuedByStudent;
    }

    public Student(String studentName, long universityRollNo, int numberOfBooksIssuedByStudent, Book[] nameOfBooksIssuedByStudent) {
        this.studentName = studentName;
        this.universityRollNo = universityRollNo;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.nameOfBooksIssuedByStudent = nameOfBooksIssuedByStudent;
    }

}
