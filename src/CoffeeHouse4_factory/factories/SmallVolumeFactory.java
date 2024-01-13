package CoffeeHouse4_factory.factories;

import CoffeeHouse4_factory.Beverage;
import CoffeeHouse4_factory.volumes.SmallVolumeBeverage;

public class SmallVolumeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new SmallVolumeBeverage();
    }
}
