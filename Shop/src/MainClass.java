import java.text.ParseException;

public class MainClass {
    public static void main(String[] args) throws ParseException {
        Product cigars = new Product("cigars", 20.00, 1, "Adult");
        Product cigarettes= new Product("Marlboro",19.00,0,"Adult");
        FoodProduct banana = new FoodProduct("banana", 2.00, 10, "None", "01-feb-2020");
        FoodProduct apple=new FoodProduct("apple",1.00, 5,"None","15-Jan-2020");
        Computer gamingPc = new Computer("gaming pc", 500.00, 1002, "Teenager", 24);
        Appliance lamp = new Appliance("lamp", 50.00, 40, "Teenager", 6);
        Customer customer1 = new Customer("Customer 1", 12, 1000.00);
        Customer customer2 = new Customer("Customer 2", 19, 200.00);
        Customer customer3 = new Customer("Customer 3", 10, 60.00);

        PurchaseManager.processPurchase(customer1, cigars, 1);
        PurchaseManager.processPurchase(customer2,cigarettes,1);
        PurchaseManager.processPurchase(customer3, lamp, 1);
        PurchaseManager.processPurchase(customer2,gamingPc,1);
        PurchaseManager.processPurchase(customer1,apple,1);
        PurchaseManager.processPurchase(customer2, banana, 3);
        PurchaseManager.processPurchase(customer1,gamingPc,1);


    }
}
