package statesEncapsulation10_vice;

// Состояние "Без монеты"
public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Вы вставили монету.");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("Вы не вставили монету.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули рычаг, но монеты нет.");
    }

    @Override
    public void dispense() {
        System.out.println("Сначала нужно вставить монету.");
    }

    @Override
    public void refill(int count) {
        gumballMachine.refill(count);
    }

    // Остальные методы для простоты примера опустим...
}
