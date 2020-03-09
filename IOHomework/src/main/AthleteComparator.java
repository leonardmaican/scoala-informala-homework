package main;

import main.entities.Athlete;

import java.util.Comparator;

/**
 * This is the comparator used to sort athletes by time
 */
public class AthleteComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Athlete a1 = (Athlete) o1;
        Athlete a2 = (Athlete) o2;
        if (a1.getTime().getMinutes() > a2.getTime().getMinutes()) {
            return 1;
        }
        if (a1.getTime().getMinutes() < a2.getTime().getMinutes()) {
            return -1;
        }
        if (a1.getTime().getMinutes().equals(a2.getTime().getMinutes())) {
            return a1.getTime().getSeconds().compareTo(a2.getTime().getSeconds());
        }
        return 0;
    }
}

