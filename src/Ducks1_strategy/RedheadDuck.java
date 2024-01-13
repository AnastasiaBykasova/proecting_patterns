package Ducks1_strategy;

public class RedheadDuck extends Duck {
    RedheadDuck() {
        super("Mallard", new FlyWithWings(), new MuteQuack());
    }
}