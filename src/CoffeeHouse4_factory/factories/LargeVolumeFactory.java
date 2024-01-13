package CoffeeHouse4_factory.factories;

import CoffeeHouse4_factory.Beverage;
import CoffeeHouse4_factory.volumes.LargeVolumeBeverage;

public class LargeVolumeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new LargeVolumeBeverage();
    }
}