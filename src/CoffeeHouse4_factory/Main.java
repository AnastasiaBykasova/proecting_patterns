package CoffeeHouse4_factory;

import CoffeeHouse4_factory.additions.*;
import CoffeeHouse4_factory.beverages.Decaf;
import CoffeeHouse4_factory.beverages.Espresso;
import CoffeeHouse4_factory.beverages.Tea;
import CoffeeHouse4_factory.volumes.VolumeDecorator;

public class Main {
    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        beverage1 = new Milk(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new VolumeDecorator(beverage1, 0.8);
        System.out.println(beverage1.getDescription() + ": ₽" + beverage1.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new VolumeDecorator(beverage2, 0.6);
        System.out.println(beverage2.getDescription() + ": ₽" + beverage2.cost());

        Beverage beverage3 = new Tea();
        beverage3 = new Syrup(beverage3);
        beverage3 = new VolumeDecorator(beverage3, 0.4);
        System.out.println(beverage3.getDescription() + ": ₽" + beverage3.cost());

        Beverage beverage4 = new Tea();
        beverage4 = new Syrup(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new VolumeDecorator(beverage4, 0.4);
        System.out.println(beverage4.getDescription() + ": ₽" + beverage4.cost());

        Beverage beverage5 = new Tea();
        beverage5 = new Syrup(beverage5);
        beverage5 = new Whip(beverage5);
        beverage5 = new VolumeDecorator(beverage5, 0.8);
        System.out.println(beverage5.getDescription() + ": ₽" + beverage5.cost());
    }

}
