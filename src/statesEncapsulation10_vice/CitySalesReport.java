package statesEncapsulation10_vice;

import java.io.Serializable;

public class CitySalesReport implements Serializable {
    private String city;
    private int totalCoins;
    private int totalGumballsDispensed;
    private int totalToysDispensed;
    private int remainingGumballs;
    private int remainingToys;

    public CitySalesReport(String city) {
        this.city = city;
    }

    // Методы для обновления данных (в реальной ситуации были бы синхронизированными методами)
    public void addCoins(int coins) {
        totalCoins += coins;
    }

    public void dispenseGumball() {
        totalGumballsDispensed++;
        remainingGumballs--;
    }

    public void dispenseToy() {
        totalToysDispensed++;
        remainingToys--;
    }

    public void refillGumballs(int count) {
        remainingGumballs += count;
    }

    public void refillToys(int count) {
        remainingToys += count;
    }

    // Геттеры и сеттеры
    public String getCity() { return city; }
    public int getTotalCoins() { return totalCoins; }
    public int getTotalGumballsDispensed() { return totalGumballsDispensed; }
    public int getTotalToysDispensed() { return totalToysDispensed; }
    public int getRemainingGumballs() { return remainingGumballs; }
    public int getRemainingToys() { return remainingToys; }

    // Методы для имитации продаж и пополнения запасов
    public void simulateSale(int coinsInserted, boolean toyDispensed) {
        this.totalCoins += coinsInserted;

        if(toyDispensed && remainingToys > 0) {
            this.totalToysDispensed++;
            this.remainingToys--;
        } else if(remainingGumballs > 0) {
            this.totalGumballsDispensed++;
            this.remainingGumballs--;
        }
    }

    public void simulateRefill(int gumballsAdded, int toysAdded) {
        this.remainingGumballs += gumballsAdded;
        this.remainingToys += toysAdded;
    }

}
