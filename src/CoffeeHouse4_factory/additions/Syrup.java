package CoffeeHouse4_factory.additions;

import CoffeeHouse4_factory.Beverage;

public class Syrup extends Beverage {
    private Beverage beverage;

    public Syrup(Beverage beverage) {
        this.beverage = beverage;
        description = beverage.getDescription() + ", Syrup";
    }

    public double cost() {
        return 35 + beverage.cost();
    }
    public double volume() {return 0.0;}
}