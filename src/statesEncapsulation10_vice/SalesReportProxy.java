package statesEncapsulation10_vice;

import java.io.Serializable;

public class SalesReportProxy {
    private SalesReportServer reportServer;

    public SalesReportProxy(SalesReportServer reportServer) {
        this.reportServer = reportServer;
    }

    public CitySalesReport getCitySalesReport(String city) {
        return reportServer.getCitySalesReport(city);
    }

}
