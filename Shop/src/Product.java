public class Product implements Buyable {
    private String name;
    private Double price;
    private Integer quantity;
    private String ageRestriction;

    public Product() {
        name = "product";
        price = 0.00;
        quantity = 0;
        ageRestriction = "none";


    }


    public Product(String name, Double price, Integer quantity, String ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
        System.out.println(getName() + " quantity remaining: " + getQuantity());
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }
}
