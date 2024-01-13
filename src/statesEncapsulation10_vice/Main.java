package statesEncapsulation10_vice;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.ejectCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        SalesReportServer server = new SalesReportServer();

        // Имитация некоторых продаж и пополнений
        server.getCitySalesReport("Newcastle").simulateSale(100, false);
        server.getCitySalesReport("Newcastle").simulateRefill(20, 5);

        server.getCitySalesReport("Manchester").simulateSale(150, true);
        server.getCitySalesReport("Manchester").simulateRefill(30, 10);

        server.getCitySalesReport("York").simulateSale(200, true);
        server.getCitySalesReport("York").simulateRefill(50, 15);

        // Предполагаем что прокси создается правильно, для примера используем прямую ссылку
        SalesReportProxy proxy = new SalesReportProxy(server);

        DisplayClient client = new DisplayClient();

        client.displayCityReport(proxy, "Newcastle");
        client.displayCityReport(proxy, "Manchester");
        client.displayCityReport(proxy, "York");

    }
}
