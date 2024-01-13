package CoffeeHouse4_factory.factories;

import CoffeeHouse4_factory.Beverage;
import CoffeeHouse4_factory.volumes.MediumVolumeBeverage;

public class MediumVolumeFactory implements BeverageFactory {
    @Override
    public Beverage createBeverage() {
        return new MediumVolumeBeverage();
    }
}