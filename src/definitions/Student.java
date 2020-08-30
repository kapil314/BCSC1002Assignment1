/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universityRollNo=" + universityRollNo +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", nameOfBooksIssuedByStudent=" + Arrays.toString(nameOfBooksIssuedByStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNo == student.universityRollNo &&
                numberOfBooksIssuedByStudent == student.numberOfBooksIssuedByStudent &&
                Objects.equals(studentName, student.studentName) &&
                Arrays.equals(nameOfBooksIssuedByStudent, student.nameOfBooksIssuedByStudent);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(studentName, universityRollNo, numberOfBooksIssuedByStudent);
        result = 31 * result + Arrays.hashCode(nameOfBooksIssuedByStudent);
        return result;
    }
}
