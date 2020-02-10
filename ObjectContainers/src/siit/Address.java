package siit;

/**
 * This class instantiates an Address at which a hobby can be practiced
 */
public class Address {
    private String street;
    private Country country;

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + street + '\'' +
                ", country=" + country +
                '}';
    }

    public Address(String street, Country country) {
        this.street = street;
        this.country = country;

    }

    public String getStreet() {
        return street;
    }

    public Country getCountry() {
        return country;
    }
}
