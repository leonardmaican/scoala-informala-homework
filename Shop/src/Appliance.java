public class Appliance extends ElectronicProduct {
    public Appliance() {
        super.setPrice(49.99);
        super.setQuantity(10);
        super.setGuaranteePeriod(6);

    }

    public Appliance(String name, Double price, Integer quantity, String ageRestriction, Integer guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
    }

    @Override
    public double getPrice() {
        if (getQuantity() < 50) {
            return super.getPrice() * 1.05;
        }

        return super.getPrice();
    }
}
