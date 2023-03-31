import org.example.StatService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {
    @Test
    public void shouldFindSaleAmount () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSaleAmount = 180;
        int actualSaleAmount = service.saleAmount (sales);
        Assertions.assertEquals (expectedSaleAmount, actualSaleAmount);
    }
    @Test
    public void shouldFindAverageSalesAmount () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSalesAmount = 15;
        int actualAverageSalesAmount = service.averageSalesAmount (sales);
        Assertions.assertEquals (expectedAverageSalesAmount, actualAverageSalesAmount);
    }
    @Test
    public void shouldFindMaxSales () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales (sales);
        Assertions.assertEquals (expectedMaxSales, actualMaxSales);
    }
    @Test
    public void shouldFindMinSales () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales (sales);
        Assertions.assertEquals (expectedMinSales, actualMinSales);
    }
    @Test
    public void shouldFindAboveAverageSales () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverageSales = 5;
        int actualAboveAverageSales = service.aboveAverageSales (sales);
        Assertions.assertEquals (expectedAboveAverageSales, actualAboveAverageSales);
    }
    @Test
    public void shouldFindSellingBelowAverage () {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSellingBelowAverage = 5;
        int actualSellingBelowAverage = service.sellingBelowAverage (sales);
        Assertions.assertEquals (expectedSellingBelowAverage, actualSellingBelowAverage);
    }
}
