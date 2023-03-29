package org.example;

public class StatService {
    public int SaleAmount(int[] Sales) {
        int Amount = 0;
        for (int i : Sales) {
            Amount += i;
        }
        return Amount;
    }
    public int AverageSalesAmount (int[] Sales) {
        int Amount = 0;
        for (int i : Sales) {
            Amount += i;
        }
        return (Amount / Sales.length);
    }
    public int MaxSales(int[] Sales) {
        int maxMonth = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] >= Sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int MinSales(int[] Sales) {
        int minMonth = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] <= Sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int AboveAverageSales (int[] Sales) {
        int count = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] > AverageSalesAmount(Sales)) {
                count++;
            }
        }
        return count;
    }
    public int SellingBelowAverage (int[] Sales) {
        int count = 0;
        for (int i = 0; i < Sales.length; i++) {
            if (Sales[i] < AverageSalesAmount(Sales)) {
                count++;
            }
        }
        return count;
    }
}
