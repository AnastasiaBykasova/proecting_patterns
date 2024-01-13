package CoffeeHouse4_factory.additions;

import CoffeeHouse4_factory.Beverage;
import CoffeeHouse4_factory.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 30 + beverage.cost();
    }
    public double volume() {return 0.0;}
}