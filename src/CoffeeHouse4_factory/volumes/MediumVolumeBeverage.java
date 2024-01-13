package CoffeeHouse4_factory.volumes;

import CoffeeHouse4_factory.Beverage;

public class MediumVolumeBeverage extends Beverage {
    public MediumVolumeBeverage() {
        description = "Medium Volume Beverage";
    }

    public double volume() {
        return 0.6;
    }

    public double cost() {
        return 0;
    }
}