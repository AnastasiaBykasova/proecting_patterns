package CoffeeHouse4_factory;

public class Order {
    private Beverage beverage;
    private String status;

    public Order(Beverage beverage, String status) {
        this.beverage = beverage;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
