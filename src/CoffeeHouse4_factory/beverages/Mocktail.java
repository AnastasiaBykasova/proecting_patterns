package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class Mocktail extends Beverage {
    public Mocktail() {
        description = "Mocktail";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 50;
    }
}