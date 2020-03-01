package siit;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/**
 * This is the demonstration class for the reverse sorting exercise
 */



public class PersonSortingApp {
    public static void main(String[] args) {
        Person gigi = new Person("Gigi", 39);
        Person vasile = new Person("Vasile", 27);
        Person ion = new Person("Ion", 48);
        Person gheorghe = new Person("Gheorghe", 52);
        Person petre = new Person("Petre", 18);

        Comparator pac = new PersonAgeComparator();

        Set personSetReversedAge = new TreeSet(pac);
        personSetReversedAge.add(gigi);
        personSetReversedAge.add(vasile);
        personSetReversedAge.add(ion);
        personSetReversedAge.add(gheorghe);
        personSetReversedAge.add(petre);
        for (Object o : personSetReversedAge) {
            Person p = (Person) o;
            System.out.println(p.getName() + " is " + p.getAge() + " years old.");
        }
    }
}
