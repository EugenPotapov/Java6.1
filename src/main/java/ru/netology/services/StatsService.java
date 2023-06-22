package ru.netology.services;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public long medianMonthSales(long[] sales) {

        long medianSales = sumAllSales(sales) / sales.length;

        return medianSales;
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

    public int belowMonthSales(long[] sales) {

        long medianSales = medianMonthSales(sales);
        int monthsBelow = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < medianSales) {
                monthsBelow = monthsBelow + 1;
            }
        }
        return monthsBelow;
    }

    public int aboveMonthSales(long[] sales) {

        long medianSales = medianMonthSales(sales);
        int monthsAbove = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > medianSales) {
                monthsAbove = monthsAbove + 1;
            }
        }
        return monthsAbove;
    }

}

