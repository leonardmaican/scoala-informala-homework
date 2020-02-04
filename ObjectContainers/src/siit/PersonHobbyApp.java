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

        Set peopleInMap = peoplesHobbies.keySet();
        for (Object o : peopleInMap) {
            Person p = (Person) o;
            printHobbyAndCountry(p, peoplesHobbies.get(p));
        }


    }

    /**
     * This method prints the name of the person, the name of the hobby,
     * the country where a hobby is being practiced and the frequency the hobby is practiced every week
     *
     * @param pers    the person for which the hobbies are printed
     * @param hobbies the hobby to be extracted from the list
     */
    public static void printHobbyAndCountry(Person pers, List<Hobby> hobbies) {

        for (Object o : hobbies) {
            Hobby h = (Hobby) o;
            List addressesList = h.getAddresses();
            for (Object o1 : addressesList) {
                Address a = (Address) o1;
                System.out.println(pers.getName() + " likes to practice " + h.getName() + " in " + a.getCountry().getCountryName() + " " + h.getFrequency() + " times a week");
            }
        }

    }


}
