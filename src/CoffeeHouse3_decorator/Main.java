package CoffeeHouse3_decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": ₽" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + ": ₽" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Milk(beverage3);
        System.out.println(beverage3.getDescription() + ": ₽" + beverage3.cost());
    }
}