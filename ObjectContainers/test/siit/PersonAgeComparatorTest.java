package siit;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class PersonAgeComparatorTest {

    @Test
    public void compare() {

        TreeSet<Person> personSetReversedAge=new TreeSet(new PersonAgeComparator());
        personSetReversedAge.add(new Person("Pers 1",24));
        personSetReversedAge.add(new Person("Pers 2",29));
        assertEquals(29,personSetReversedAge.first().getAge());

    }
}