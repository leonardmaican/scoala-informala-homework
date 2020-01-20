public class Customer {
    private String name;
    private Integer age;
    private Double balance;

    public Customer() {
        name = "default";
        age = 0;
        balance = 0.00;

    }

    public Customer(String name, Integer age, Double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
        System.out.println("Balance remaining: " + getBalance());
    }
}
