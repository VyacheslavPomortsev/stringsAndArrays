package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int allSales(long[] sales) {
        int sum = 0;
        {
            for (int i = 0; i < sales.length; ++i)
                sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minDay(long[] sales) {
        int minDay = 0;
        int average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                minDay++;
            }
        }
        return minDay;
    }

    public int maxDay(long[] sales) {
        int maxDay = 0;
        int average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                maxDay++;
            }
        }
        return maxDay;
    }
}
