package siit;

import java.util.*;

/**
 * This is the demo class for the second exercise
 */
public class PersonHobbyApp {
    public static void main(String[] args) {
        Address skiingAddress = new Address("Val d'Isere", new Country("France", "Fra"));
        Address skiingAddress2 = new Address("Garmisch Partenkirchen", new Country("Germany", "Ger"));
        Address swimmingAddress = new Address("Saint Tropez", new Country("France", "Fra"));
        Address swimmingAddress2 = new Address("Antalya", new Country("Turkey", "Tur"));
        Address shoppingAddress = new Address("Dubai", new Country("United Arad Emirates", "Uae"));
        Address shoppingAddress2 = new Address("Milano", new Country("Italy", "Ita"));
        Address fishingAddress = new Address("Sulina", new Country("Romania", "Rou"));
        Address fishingAddress2 = new Address("Azore Islands", new Country("Portugal", "Por"));

        List skiingAddresses = new ArrayList();
        skiingAddresses.add(skiingAddress);
        skiingAddresses.add(skiingAddress2);

        List swimmingAddresses = new ArrayList();
        swimmingAddresses.add(swimmingAddress);
        swimmingAddresses.add(swimmingAddress2);

        List shoppingAddresses = new ArrayList();
        shoppingAddresses.add(shoppingAddress);
        shoppingAddresses.add(shoppingAddress2);

        List fishingAddresses = new ArrayList();
        fishingAddresses.add(fishingAddress);
        fishingAddresses.add(fishingAddress2);

        Hobby skiing = new Hobby("Skiing", 3, skiingAddresses);
        Hobby shopping = new Hobby("Shopping", 3, shoppingAddresses);
        Hobby swimming = new Hobby("Swimming", 2, swimmingAddresses);
        Hobby fishing = new Hobby("Fishing", 2, fishingAddresses);

        List bobsHobbies = new ArrayList();
        bobsHobbies.add(skiing);
        bobsHobbies.add(shopping);

        List georgesHobbies = new ArrayList();
        georgesHobbies.add(swimming);
        georgesHobbies.add(fishing);

        Person bob = new Person("Bob", 25);
        Person george = new Person("George", 36);

        Map<Person, List<Hobby>> peoplesHobbies = new HashMap<>();
        peoplesHobbies.put(bob, bobsHobbies);
        peoplesHobbies.put(george, georgesHobbies);

        printHobbyAndCountry(peoplesHobbies, bob);


    }

    /**
     * This method checks if the person passed as an argument can be found in the map passed in the argument
     * if the person is in the map, the method will print the person's hobby name and the countries where the hobby can be practiced
     * @param map The map of people and their respective hobbies
     * @param pers the person to be looked up in the map
     */

    public static void printHobbyAndCountry(Map<Person, List<Hobby>> map, Person pers) {
        if (map.keySet().contains(pers)) {
            for (Object o : map.get(pers)) {
                Hobby h = (Hobby) o;
                List addressesList = h.getAddresses();
                for (Object o1 : addressesList) {
                    Address a = (Address) o1;
                    System.out.println(pers.getName() + " likes to practice " + h.getName() + " in " + a.getCountry().getCountryName() + " " + h.getFrequency() + " times a week");

                }


            }


        }
    }
}
