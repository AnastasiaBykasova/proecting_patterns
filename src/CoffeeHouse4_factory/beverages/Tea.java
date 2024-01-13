package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class Tea extends Beverage {
    public Tea() {
        description = "Tea";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 20;
    }
}