package main.entities;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {


    /**
     * Testing the equals method
     */
    @Test
    public void testEquals() {
        Person testPerson = new Person("Test", "Person", LocalDate.of(1992, 3, 21));
        Person testPerson2 = new Person("Test", "Person", LocalDate.of(1995, 3, 31));
        assertEquals(testPerson, testPerson2);
    }

    /**
     * Testing the compareTo method used to sort person objects
     */
    @Test
    public void compareTo() {
        Person testPerson = new Person("Abc", "Def", LocalDate.of(1992, 3, 21));
        Person testPerson2 = new Person("Abc", "Efg", LocalDate.of(1992, 3, 21));
        int result = testPerson.compareTo(testPerson2);
        assertEquals(-1, result);
    }
}