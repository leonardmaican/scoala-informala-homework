package main.entities;


import java.time.LocalDate;
import java.util.Objects;

/**
 * Person object implementation
 */
public class Person implements Comparable {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());

    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

        return lastName.compareTo(p.getLastName());
    }
}
