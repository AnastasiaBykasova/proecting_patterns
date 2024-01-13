package statesEncapsulation10_vice;

public class RemoteClient {

    private SalesReportProxy reportProxy;

    public RemoteClient(SalesReportProxy reportProxy) {
        this.reportProxy = reportProxy;
    }

    public void displaySalesReport() {
        // Получаем сериализованные данные через прокси
        // Отображаем данные отчета о продажах
    }
}
