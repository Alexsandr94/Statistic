import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

    @Test
    public void theSumOfAllSales() {
        StatisticService Service = new StatisticService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 180;
        int actualMonth = Service.totalAmount(month);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void findAverages() {
        StatisticService Service = new StatisticService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 15;
        int actualMonth = Service.findAverage(month);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void maxSales() {
        StatisticService Service = new StatisticService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = Service.maxSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minSales() {
        StatisticService Service = new StatisticService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = Service.minSales(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void averageMin() {
        StatisticService Service = new StatisticService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = Service.averageMin(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void averageMax() {
        StatisticService Service = new StatisticService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 7;
        int actualMonth = Service.averageMax(month);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
