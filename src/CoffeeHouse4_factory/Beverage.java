package CoffeeHouse4_factory;

import CoffeeHouse4_factory.factories.BeverageFactory;
import CoffeeHouse4_factory.volumes.VolumeModifier;

public abstract class Beverage implements VolumeModifier {

    protected String description = "Beverage";
    public String getDescription() {
        return description;
    }
    protected boolean hasMilk;
    protected boolean hasSoy;
    protected boolean hasMocha;
    protected boolean hasWhip;

    public static Beverage createWithSize(BeverageFactory factory) {
        return factory.createBeverage();
    }
    protected double volume = 100.0;

    public double modifyVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
    public abstract double cost();

    public boolean hasMilk() {
        return hasMilk;
    }

    public void setMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public boolean hasSoy() {
        return hasSoy;
    }

    public void setSoy(boolean hasSoy) {
        this.hasSoy = hasSoy;
    }

    public boolean hasMocha() {
        return hasMocha;
    }

    public void setMocha(boolean hasMocha) {
        this.hasMocha = hasMocha;
    }

    public boolean hasWhip() {
        return hasWhip;
    }

    public void setWhip(boolean hasWhip) {
        this.hasWhip = hasWhip;
    }
}