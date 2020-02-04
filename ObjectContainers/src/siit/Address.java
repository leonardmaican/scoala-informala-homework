package siit;

/**
 * This class instantiates an Address at which a hobby can be practiced
 */
public class Address {
    String streetAddress;
    Country country;

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", country=" + country +
                '}';
    }

    public Address(String streetAddress, Country country) {
        this.streetAddress = streetAddress;
        this.country = country;

    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public Country getCountry() {
        return country;
    }
}
