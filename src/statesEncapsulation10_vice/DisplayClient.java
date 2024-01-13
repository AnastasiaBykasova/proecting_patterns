package statesEncapsulation10_vice;

public class DisplayClient {
    public void displayCityReport(SalesReportProxy proxy, String city) {
        CitySalesReport report = proxy.getCitySalesReport(city);

        // Демонстрируем отчетные данные для города
        System.out.println("Отчет для города " + city);
        System.out.println("Всего монет: " + report.getTotalCoins());
        System.out.println("Количество выданных жвачек: " + report.getTotalGumballsDispensed());
        System.out.println("Количество выданных игрушек: " + report.getTotalToysDispensed());
        System.out.println("Осталось жевательных резинок: " + report.getRemainingGumballs());
        System.out.println("Осталось игрушек: " + report.getRemainingToys());
    }
}

