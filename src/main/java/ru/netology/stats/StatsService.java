package ru.netology.stats;

public class StatsService {

    public long calculateTotalSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long calculateAverageSales(long[] sales) {
        return calculateTotalSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int monthsBellow = 0;
        long averageSales = calculateAverageSales(sales);

        for (long sale : sales) {
            if (sale < averageSales) {
                monthsBellow++;
            }
        }
        return monthsBellow;

    }

    public int monthsHigherAverage(long[] sales) {
        int monthsHigher = 0;
        long averageSales = calculateAverageSales(sales);

        for (long sale : sales) {
            if (sale > averageSales)
                monthsHigher++;

        }
        return monthsHigher;

    }


}
