package statesEncapsulation10_vice;

import java.util.HashMap;
import java.util.Map;

public class SalesReportServer {
    private Map<String, CitySalesReport> salesReportsByCity = new HashMap<>();

    public SalesReportServer() {
        salesReportsByCity.put("Newcastle", new CitySalesReport("Newcastle"));
        salesReportsByCity.put("Manchester", new CitySalesReport("Manchester"));
        salesReportsByCity.put("York", new CitySalesReport("York"));

    }

    public CitySalesReport getCitySalesReport(String city) {
        return salesReportsByCity.get(city);
    }

}
