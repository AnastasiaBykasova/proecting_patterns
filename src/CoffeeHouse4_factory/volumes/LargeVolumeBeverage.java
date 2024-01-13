package CoffeeHouse4_factory.volumes;

import CoffeeHouse4_factory.Beverage;

public class LargeVolumeBeverage extends Beverage {
    public LargeVolumeBeverage() {
        description = "Large Volume Beverage";
    }

    public double volume() {
        return 0.8;
    }

    public double cost() {
        return 0;
    }
}