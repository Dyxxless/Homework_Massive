package ru.netology.stats;

public class StatsService {

    public long amountSales(long[] sales) {
        //1. Сумма всех продаж

        long amountSales = 0; //Переменная, в которую вложится сумма всех продаж
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            amountSales = amountSales + sale;
        }
        return amountSales;
    }

    public long averageAmountSales(long[] sales) {
        //2. Средняя сумма продаж в месяц

        long amountSales = 0; //Переменная, в которую вложится сумма всех продаж
        long months = 0; // Количество месяцев с продажами
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            amountSales = amountSales + sale;
            months = months + 1;
        }
        return amountSales / months;
    }

    public int monthWithMaxSales(long[] sales) {
        //3. Номер месяца, в котором был максимум продаж, т.е. осуществлены продажи на максимальную сумму

        int monthWithMaxSales = 0; //Номер месяца максимальных продаж
        int month = 0; // переменная для месяца, рассматриваемого в массиве
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            if (sale >= sales[monthWithMaxSales]) {
                monthWithMaxSales = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return monthWithMaxSales + 1;
    }

    public int monthWithMinSales(long[] sales) {
        //4. Номер месяца, в котором был минимум продаж, т.е. осуществлены продажи на минимальную сумму

        int monthWithMinSales = 0; //Номер месяца минимальных продаж
        int month = 0; // переменная для месяца, рассматриваемого в массиве
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            if (sale <= sales[monthWithMinSales]) {
                monthWithMinSales = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return monthWithMinSales + 1;
    }

    public long monthsWithSalesBelowAverage(long[] sales) {
        //5. Количество месяцев, в которых продажи были ниже среднего

        long amountSales = 0; //Переменная, в которую вложится сумма всех продаж
        long months = 0; // Количество месяцев с продажами
        long amountMonth = 0; //счётчик месяцев, в которых продажи ниже среднего
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            amountSales = amountSales + sale;
            months = months + 1;
        }
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            long averageSales = amountSales / months; //сумма средней продажи в месяц (15)
            if (sale < averageSales) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }

    public long monthsWithSalesAboveAverage(long[] sales) {
        //6. Количество месяцев, в которых продажи были выше среднего

        long amountSales = 0; //Переменная, в которую вложится сумма всех продаж
        long months = 0; // Количество месяцев с продажами
        long amountMonth = 0; //счётчик месяцев, в которых продажи выше среднего
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            amountSales = amountSales + sale;
            months = months + 1;
        }
        for (long sale : sales) {
            // sales - продажи в месяце (искомая величина)
            // sale - продажи в рассматриваемом (перебираемом) месяце
            long averageSales = amountSales / months; //сумма средней продажи в месяц (15)
            if (sale > averageSales) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}
