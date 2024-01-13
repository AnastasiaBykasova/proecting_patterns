package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 60;
    }
}