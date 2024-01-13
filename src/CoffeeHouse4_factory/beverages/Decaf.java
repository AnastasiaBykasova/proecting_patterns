package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 70;
    }
}