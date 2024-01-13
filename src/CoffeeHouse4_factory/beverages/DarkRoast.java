package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 80;
    }
}