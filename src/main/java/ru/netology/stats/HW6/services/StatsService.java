package ru.netology.stats.HW6.services;

import java.util.Arrays;

public class StatsService {
    //long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int sumOfSales(long[] sales) {

        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return (int) sum;

        // System.out.println("The sum of all elements in the sales array is: " + sum);

    }

    public int averageSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int averageSales = sum / sales.length;

        return averageSales;
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

        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsUnderAverage(long[] sales) {

        int monthUnderAverage = 0;
        int sumOfMonthsUnderAverage = 0;
        double averageSales = 15;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                monthUnderAverage = 1;
                sumOfMonthsUnderAverage += monthUnderAverage;
            }
        }
        return sumOfMonthsUnderAverage;

    }

    public int monthsOverAverage(long[] sales) {

        int monthOverAverage = 0;
        int sumOfMonthsOverAverage = 0;
        double averageSales = 15;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                monthOverAverage = 1;
                sumOfMonthsOverAverage += monthOverAverage;
            }
        }
        return sumOfMonthsOverAverage;

    }
}





