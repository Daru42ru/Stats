package org.example;

public class StatService {
    public int saleAmount(int[] sales) {
        int amount = 0;
        for (int i : sales) {
            amount += i;
        }
        return amount;
    }

    public int average(int[] sales) {
        if (sales.length != 0) {
            return saleAmount(sales) / sales.length;
        }
        return 0;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int aboveAverageSales(int[] sales) {
        int count = 0;
        int average = average(sales);
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int sellingBelowAverage(int[] sales) {
        int count = 0;
        int average = average(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }
}
