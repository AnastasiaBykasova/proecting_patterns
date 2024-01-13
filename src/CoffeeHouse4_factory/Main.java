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
        Order order1 = new Order(beverage1, "в процессе");
        System.out.println(beverage1.getDescription() + "; ₽" + beverage1.cost() + "; статус: " + order1.getStatus());


        Beverage beverage2 = new Decaf();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new VolumeDecorator(beverage2, 0.6);
        Order order2 = new Order(beverage1, "в процессе");
        order2.setStatus("готово");
        System.out.println(beverage2.getDescription() + "; ₽" + beverage2.cost() + "; статус: " + order2.getStatus());


        Beverage beverage3 = new Tea();
        beverage3 = new Syrup(beverage3);
        beverage3 = new VolumeDecorator(beverage3, 0.4);
        Order order3 = new Order(beverage1, "в процессе");
        System.out.println(beverage3.getDescription() + "; ₽" + beverage3.cost() + "; статус: " + order3.getStatus());


        Beverage beverage4 = new Tea();
        beverage4 = new Syrup(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new VolumeDecorator(beverage4, 0.4);
        Order order4 = new Order(beverage1, "в процессе");
        order4.setStatus("готово");
        System.out.println(beverage4.getDescription() + "; ₽" + beverage4.cost() + "; статус: " + order4.getStatus());


        Beverage beverage5 = new Tea();
        beverage5 = new Syrup(beverage5);
        beverage5 = new Whip(beverage5);
        beverage5 = new VolumeDecorator(beverage5, 0.8);
        Order order5 = new Order(beverage1, "в процессе");
        System.out.println(beverage5.getDescription() + "; ₽" + beverage5.cost() + "; статус: " + order5.getStatus());

    }

}
