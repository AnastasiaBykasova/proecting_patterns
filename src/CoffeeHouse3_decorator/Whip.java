package CoffeeHouse3_decorator;

public class Whip extends Beverage {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 15 + beverage.cost();
    }
}