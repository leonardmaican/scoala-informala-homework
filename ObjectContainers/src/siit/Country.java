package siit;

/**
 * This class instantiates a country, used to create an address at which a hobby can be practiced
 */
public class Country {
    private String name;
    private String code;

    @Override
    public String toString() {
        return "Country{" +
                "countryName= '" + name + '\'' +
                ", countryCode='" + code + '\'' +
                '}';
    }

    public Country(String countryName, String countryCode) {
        this.name = countryName;
        this.code = countryCode;
    }

    public String getCountryName() {
        return name;
    }

    public String getCountryCode() {
        return code;
    }
}
