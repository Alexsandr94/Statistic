public class StatisticService {
    public long totalAmount(long[] amount) {
        long sum = 0;
        for (long sale : amount) {
            sum += sale;
        }
        return (sum);
    }


    public long findAverage(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return totalAmount(sales) / sales.length;
    }


    public int maxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] < minMonth) {
                minMonth = i;
            }
        }
        return sales[minMonth];
    }


    public int averageMin(long[] sales) {
        long averMin = findAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averMin) {
                count++;
            }
        }
        return count;
    }


    public int averageMax(long[] sales) {
        long averMax = findAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale >= averMax) {
                count++;
            }
        }
        return count;
    }
}
