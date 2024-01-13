package statesEncapsulation10_vice;

public class HasCoinState implements State {
    GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Вы не можете вставить еще одну монету.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Монета возвращена.");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули рычаг...");
        int chance = gumballMachine.randomWinner.nextInt(100);
        if ((chance < 10) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else if (chance < 25){
            gumballMachine.setState(gumballMachine.getToyState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Приз не выдается, пока вы не повернете рычаг.");
    }

    @Override
    public void refill(int count) {
        System.out.println("Вы не можете заполнить автомат, пока в нем есть монета.");
    }
}
