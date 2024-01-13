package statesEncapsulation10_vice;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Вы не можете вставить монету. Жвачки закончились.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Невозможно вернуть монету, так как она не была вставлена.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули рычаг, но жвачки нет.");
    }

    @Override
    public void dispense() {
        System.out.println("Жвачка не может быть выдана, так как автомат пуст.");
    }

    @Override
    public void refill(int count) {
        System.out.println("Автомат пополнен новыми жвачками.");
        gumballMachine.refill(count);
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
}
