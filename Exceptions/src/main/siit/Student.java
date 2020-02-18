package siit;

import java.time.LocalDate;
import java.util.Objects;

/**
 * This class instantiates a student object to be added to the repository
 */

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String cnp;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cnp = cnp;
    }


    /**
     * This method asserts that two student objects with the same cnp  are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return cnp.equals(student.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getCnp() {
        return cnp;
    }
}
