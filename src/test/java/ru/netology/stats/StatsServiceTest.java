package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void testTotalSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateTotalSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverageSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateAverageSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthMaxSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthMinSales () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthBellowAverage () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.monthsBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthHigherAverage () {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.monthsHigherAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }


}