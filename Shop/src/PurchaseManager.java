import java.util.Date;

public class PurchaseManager {

    public static void processPurchase(Customer customer, Product product, int quantity) {

        if (product.getAgeRestriction().equals("Adult") && customer.getAge() < 18) {
            System.out.println(customer.getName() + ", you are too young to buy this product: " + product.getName());
        } else if (quantity > product.getQuantity()) {
            System.out.println(customer.getName() + ", there is insufficient stock");
        } else if (customer.getBalance() < product.getPrice()) {
            System.out.println(customer.getName() + ", you do not have enough money to buy this product: " + product.getName());
        } else if (product.getQuantity() < 1) {
            System.out.println(customer.getName() + ", this product is not in stock");
        } else if (product.getAgeRestriction().equals("Teenager") && customer.getAge() < 12) {
            System.out.println(customer.getName() + ", you are too young to buy this electronic product: " + product.getName());
        } else if (product.getClass().equals(FoodProduct.class)) {
            if (((FoodProduct) product).getExpirationDate().compareTo(new Date()) < 0) {
                System.out.println(customer.getName() + ", this product has expired: " + product.getName());
            }
            System.out.println(customer.getName() + ", you successfully bought: " + product.getName());
            System.out.println("Amount spent: " + product.getPrice() * quantity);
            product.setQuantity(product.getQuantity() - quantity);
            customer.setBalance(customer.getBalance() - (product.getPrice() * quantity));


        } else {
            System.out.println(customer.getName() + ", you successfully bought: " + product.getName());
            product.setQuantity(product.getQuantity() - quantity);
            System.out.println("Amount spent: " + product.getPrice() * quantity);
            customer.setBalance(customer.getBalance() - (product.getPrice() * quantity));
            if (product.getClass().equals(Computer.class)) {
                System.out.println("There is a sale ongoing. New price: " + product.getPrice());
                System.out.println("The guarantee period for your computer is: " + ((Computer) product).getGuaranteePeriod() + " months");
            } else if (product.getClass().equals(Appliance.class)) {
                System.out.println("This product is in short supply. New price: " + product.getPrice());
                System.out.println("The guarantee period for your appliance is: " + ((Appliance) product).getGuaranteePeriod() + " months");
            }
        }

    }
}
