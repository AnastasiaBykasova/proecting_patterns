package statesEncapsulation9_condition;

import java.util.Random;

public class GumballMachine {

    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
    State winnerState;
    State toyState;

    State state = soldOutState;
    int count = 0;
    Random randomWinner = new Random(System.currentTimeMillis());

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        toyState = new ToyState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("Жвачка выдается...");
        if (count != 0) {
            count--;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("Автомат заполнен; текущее количество жвачек: " + this.count);
        state.refill(count);
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getToyState() {
        return toyState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
