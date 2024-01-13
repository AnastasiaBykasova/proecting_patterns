package CoffeeHouse3_decorator;

public class Soy extends Beverage {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 25 + beverage.cost();
    }
}