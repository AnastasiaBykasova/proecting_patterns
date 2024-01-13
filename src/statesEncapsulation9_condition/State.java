package statesEncapsulation9_condition;

public interface State {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
    void refill(int count);
}
