package Ducks1_strategy;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new SaxonyDuck();
        Duck duck2 = new RubberDuck();
        Duck duck3 = new DecoyDuck();
        Duck duck4 = new RedheadDuck();

        System.out.println("Саксонская утка");
        duck1.performQuack();
        duck1.performFly();

        System.out.println("\nРезиновая утка");
        duck2.performQuack();
        duck2.performFly();

        System.out.println("\nУтка-приманка");
        duck3.performQuack();
        duck3.performFly();
        duck3.setFlyBehavior(new FlyWithRad());
        duck3.performFly();

        System.out.println("\nКрасноголовая утка");
        duck4.performQuack();
        duck4.performFly();
    }
}