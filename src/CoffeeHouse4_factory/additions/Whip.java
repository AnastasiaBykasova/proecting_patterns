package CoffeeHouse4_factory.additions;

import CoffeeHouse4_factory.Beverage;

public class Whip extends Beverage {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 15 + beverage.cost();
    }
    public double volume() {return 0.0;}
}