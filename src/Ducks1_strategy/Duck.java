package Ducks1_strategy;
// Базовый класс утки
public abstract class Duck {
    private String duckType;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    Duck(String duckType, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.duckType = duckType;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    void performFly() {
        flyBehavior.fly();
    }
    void performQuack() {
        quackBehavior.quack();
    }
    FlyBehavior getFlyBehavior() {
        return this.flyBehavior;
    }
    void setFlyBehavior(FlyBehavior newFlyBehavior) {
        this.flyBehavior = newFlyBehavior;
    }
}