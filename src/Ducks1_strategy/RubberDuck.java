package Ducks1_strategy;

public class RubberDuck extends Duck {
    RubberDuck() {
        super("Rubber", new FlyNoWay(), new MuteQuack());
    }
}
