package ru.netology.stats;

public class StatsService {

    public long calculateSum (long [] sales){
        long sum = 0;
        for (long sale : sales){
            sum = sum + sale;
        }
        return sum;
    }

    public long calculateAvg (long [] sales){
        return calculateSum(sales)/sales.length;
    }

    public long maxSales(long [] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long [] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long belowAvg(long [] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < calculateAvg(sales)) {
                count = count+1;
            }
        }
        return count;
    }

    public long aboveAvg(long [] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > calculateAvg(sales)) {
                count = count+1;
            }
        }
        return count;
    }
}
