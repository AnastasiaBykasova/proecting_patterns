package Ducks1_strategy;

public class DecoyDuck extends Duck {
    DecoyDuck() {
        super("Decoy", new FlyNoWay(), new Quack());
    }
}
