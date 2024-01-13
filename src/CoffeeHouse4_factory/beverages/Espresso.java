package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 90;
    }
}