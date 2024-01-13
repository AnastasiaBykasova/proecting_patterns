package CoffeeHouse4_factory.volumes;

import CoffeeHouse4_factory.Beverage;

public class VolumeDecorator extends Beverage {
    private Beverage beverage;
    private double volume;

    public VolumeDecorator(Beverage beverage, double volume) {
        this.beverage = beverage;
        this.volume = volume;
    }

    public String getDescription() {
        return beverage.getDescription() + " - " + volume + " ml";
    }

    @Override
    public double cost() {
        double volumeCost = calculateVolumeCost();
        return (int) (beverage.cost() + volumeCost);
    }

    public double modifyVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private double calculateVolumeCost() {
        double volumePercentage = volume * 100;
        return beverage.cost() * (volumePercentage / 100);
    }
}
