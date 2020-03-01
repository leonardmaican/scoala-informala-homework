import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodProduct extends Product implements Expirable {
    private Date expirationDate;

    public FoodProduct(String name, Double price, Integer quantity, String ageRestriction, String expirationDate) throws ParseException {
        super(name, price, quantity, ageRestriction);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        this.expirationDate = formatter.parse(expirationDate);


    }

    @Override
    public Date getExpirationDate() {


        return expirationDate;

    }

    @Override
    public double getPrice() {
        Date date = new Date();
        if (expirationDate.compareTo(date) < 15) {

            return super.getPrice() * 0.70;
        }
        return super.getPrice();
    }
}
