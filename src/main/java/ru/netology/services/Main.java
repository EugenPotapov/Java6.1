package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();

        long[] sales = new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long count1 = 0;
        long count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        count1 = service.sumAllSales(sales);
        System.out.println("Сумма продаж - " + count1);

        count2 = service.medianMonthSales(sales);
        System.out.println("Среднемесячные продажи - " + count2);

        count3 = service.maxSales(sales);
        System.out.println("Месяц максимальных продаж - " + count3);

        count4 = service.minSales(sales);
        System.out.println("Месяц минимальных продаж - " + count4);

        count5 = service.belowMonthSales(sales);
        System.out.println("Количество месяцев с продажами ниже среднего - " + count5);

        count6 = service.aboveMonthSales(sales);
        System.out.println("Количество месяцев с продажами выше среднего - " + count6);

    }
}