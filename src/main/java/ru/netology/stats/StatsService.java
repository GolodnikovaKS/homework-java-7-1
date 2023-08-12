package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageMonthlySalesAmount(long[] sales) {
        long average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales){
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]){
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthSumBelowAverage(long[] sales){
        int countMontBelow = 0;
        long averageSales = averageMonthlySalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                countMontBelow++;
            }
        }
        return countMontBelow;
    }

    public int countMonthSumАboveAverage(long[] sales){
        int countMontAbove = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i]>averageMonthlySalesAmount(sales)){
                countMontAbove ++;
            }
        }
        return countMontAbove;
    }

}
