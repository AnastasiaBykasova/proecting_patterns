package CoffeeHouse4_factory.beverages;

import CoffeeHouse4_factory.Beverage;

public class FruitJuice extends Beverage {
    public FruitJuice() {
        description = "Fruit Juice";
    }

    public double volume() {return 0.0;}

    public double cost() {
        return 40;
    }
}