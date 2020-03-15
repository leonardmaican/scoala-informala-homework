package main.entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * This class instantiates a person
 */
public class Person implements Comparable {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;

    public Person(String name, LocalDate dateOfBirth, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                ", dateOfBirth = " + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return name.compareToIgnoreCase(p.getName());
    }
}
