package statesEncapsulation9_condition;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Пожалуйста, дождитесь выдачи жвачки.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Извините, вы уже повернули рычаг.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Поворот рычага не даст вам второй жвачки!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            System.out.println("Ой, жвачки закончились!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Вы не можете заполнить автомат, пока происходит выдача жвачки.");
    }
}
