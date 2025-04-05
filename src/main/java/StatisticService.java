

public class StatisticService {
    public int totalAmount(int[] amount) {
        int sum = 0;
        for (int sale : amount) {
            sum += sale;
        }
        return (sum);
    }


    public int findAverage(int[] sales) {
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


    public int averageMin(int[] sales) {
        int averMin = findAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < averMin) {
                count++;
            }
        }
        return count;
    }


    public int averageMax(int[] sales) {
        int averMax = findAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale >= averMax) {
                count++;
            }
        }
        return count;
    }
}
