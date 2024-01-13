package CoffeeHouse3_decorator;

public abstract class Beverage {
    protected String description = "Beverage";
    protected boolean hasMilk;
    protected boolean hasSoy;
    protected boolean hasMocha;
    protected boolean hasWhip;

    public String getDescription() {
        return description;
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