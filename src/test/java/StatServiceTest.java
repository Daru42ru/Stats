import org.example.StatService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {
    @Test
    public void ShoudFindSaleAmount () {
        StatService service = new StatService();
        int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSaleAmount = 180;
        int actualSaleAmount = service.SaleAmount (Sales);
        Assertions.assertEquals (expectedSaleAmount, actualSaleAmount);
    }
    @Test
    public void ShoudFindAverageSalesAmount () {
        StatService service = new StatService();
        int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSalesAmount = 15;
        int actualAverageSalesAmount = service.AverageSalesAmount (Sales);
        Assertions.assertEquals (expectedAverageSalesAmount, actualAverageSalesAmount);
    }
    @Test
    public void ShoudFindMaxSales () {
        StatService service = new StatService();
        int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.MaxSales (Sales);
        Assertions.assertEquals (expectedMaxSales, actualMaxSales);
    }
    @Test
    public void ShoudFindMinSales () {
        StatService service = new StatService();
        int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.MinSales (Sales);
        Assertions.assertEquals (expectedMinSales, actualMinSales);
    }
    @Test
    public void ShoudFindAboveAverageSales () {
        StatService service = new StatService();
        int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverageSales = 5;
        int actualAboveAverageSales = service.AboveAverageSales (Sales);
        Assertions.assertEquals (expectedAboveAverageSales, actualAboveAverageSales);
    }
    @Test
    public void ShoudFindSellingBelowAverage () {
        StatService service = new StatService();
        int[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSellingBelowAverage = 5;
        int actualSellingBelowAverage = service.SellingBelowAverage (Sales);
        Assertions.assertEquals (expectedSellingBelowAverage, actualSellingBelowAverage);
    }
}
