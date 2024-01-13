package statesEncapsulation9_condition;

public class ToyState implements State {
    GumballMachine gumballMachine;

    public ToyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Пожалуйста, подождите, вам выдается игрушка.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Извините, монета уже не может быть возвращена.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Поворачивать рычаг снова не нужно.");
    }

    @Override
    public void dispense() {
        System.out.println("Вам повезло! Вы получите игрушку вместо жвачки.");
        // Здесь должен быть код, который "выдает" игрушку
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            System.out.println("Ой, жвачки закончились!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Вы не можете заполнять автомат, во время выдачи игрушки.");
    }
}