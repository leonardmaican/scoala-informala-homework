package siit;
import java.util.List;
/**
 * This class instantiates a hobby
 */


public class Hobby {
    private String name;
    private int frequency;
    private List<Address> address;

    public Hobby(String name, int frequency, List<Address> address) {
        this.name = name;
        this.frequency = frequency;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getAddresses() {
        return address;
    }
}
