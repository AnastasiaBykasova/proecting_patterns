package CoffeeHouse4_factory.additions;

import CoffeeHouse4_factory.Beverage;

public class Soy extends Beverage {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 25 + beverage.cost();
    }
    public double volume() {return 0.0;}
}