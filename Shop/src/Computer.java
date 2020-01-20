public class Computer extends ElectronicProduct {
    public Computer() {
        guaranteePeriod = 24;
        setAgeRestriction("Teenager");
    }

    public Computer(String name, Double price, Integer quantity, String ageRestriction, Integer guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
    }


    @Override
    public void setGuaranteePeriod(Integer guaranteePeriod) {
        super.setGuaranteePeriod(24);
    }

    public double getPrice() {
        if (super.getQuantity() > 1000) {
            return super.getPrice() * 0.95;
        }

        return super.getPrice();
    }
}


