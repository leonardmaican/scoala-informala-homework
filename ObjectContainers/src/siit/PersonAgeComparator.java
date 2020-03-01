package siit;

import java.util.Comparator;

/**
 * This class instantiates a comparator that sorts a set of people from oldest to youngest
 * This comparator class is implemented backwards, so the treeSet is going to sort people from oldest to youngest
 */
public class PersonAgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        return Integer.compare(p2.getAge(), p1.getAge());
    }


}
