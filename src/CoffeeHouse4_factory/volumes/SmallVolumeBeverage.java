package CoffeeHouse4_factory.volumes;

import CoffeeHouse4_factory.Beverage;

public class SmallVolumeBeverage extends Beverage {
    public SmallVolumeBeverage() {
        description = "Small Volume Beverage";
    }

    public double volume() {
        return 0.4;
    }

    public double cost() {
        return 0;
    }
}