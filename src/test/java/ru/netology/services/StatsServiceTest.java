package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMedianMonthSales() {
        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.medianMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBelowMonthSales() {
        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveMonthSales() {
        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

}
