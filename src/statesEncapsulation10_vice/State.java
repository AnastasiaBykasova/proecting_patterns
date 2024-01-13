package statesEncapsulation10_vice;

public interface State {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
    void refill(int count);
}
