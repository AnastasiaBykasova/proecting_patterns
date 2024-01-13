package CoffeeHouse4_factory.additions;

import CoffeeHouse4_factory.Beverage;
import CoffeeHouse4_factory.CondimentDecorator;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return 20 + beverage.cost();
    }
    public double volume() {return 0.0;}
}