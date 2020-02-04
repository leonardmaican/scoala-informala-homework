package siit;

/**
 * This class instantiates a country, used to create an address at which a hobby can be practiced
 */
public class Country {
    private String countryName;
    private String countryCode;

    @Override
    public String toString() {
        return "Country{" +
                "countryName= '" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }

    public Country(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
