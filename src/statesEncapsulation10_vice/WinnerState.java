package statesEncapsulation10_vice;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Пожалуйста, подождите, вам выдается вторая жвачка.");
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
        System.out.println("ВЫ ПОБЕДИТЕЛЬ! Вы получите две жвачки за вашу монету.");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else {
                System.out.println("Ой, жвачки закончились!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill(int count) {
        System.out.println("Вы не можете заполнить автомат в данный момент.");
    }
}
