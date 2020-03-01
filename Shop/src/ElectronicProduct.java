public class ElectronicProduct extends Product {
    Integer guaranteePeriod;

    public ElectronicProduct() {
        guaranteePeriod = 0;
    }

    public ElectronicProduct(String name, Double price, Integer quantity, String ageRestriction, Integer guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public Integer getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(Integer guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
