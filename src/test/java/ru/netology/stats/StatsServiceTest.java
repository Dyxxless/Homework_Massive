package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void amountSales() {
        //1. Сумма всех продаж
        long expectedAmountSales = 180; //ожидаемая сумма продаж
        long actualAmountSales = service.amountSales(sales); //реальная (поссчитанная) сумма продаж

        Assertions.assertEquals(expectedAmountSales, actualAmountSales);
    }

    @Test
    public void averageAmountSales() {
        //2. Средняя сумма продаж в месяц
        long expectedAverageAmountSales = 15; //ожидаемая средняя сумма продаж в месяц
        long actualAverageAmountSales = service.averageAmountSales(sales); //реальная (посчитанная) средняя сумма продаж в месяц

        Assertions.assertEquals(expectedAverageAmountSales, actualAverageAmountSales);
    }

    @Test
    public void monthWithMaximumSales() {
        //3. Номер месяца, в котором был максимум продаж, т.е. осуществлены продажи на максимальную сумму
        int expectedMaxSales = 8; //ожидаемый месяц с максимальными продажами
        int actualMaxSales = service.monthWithMaxSales(sales); //реальный месяц с масимальными продажами

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void monthWithMinimalSales() {
        //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int expectedMinSales = 9; //ожидаемый месяц с минимальными продажами
        int actualMinSales = service.monthWithMinSales(sales); //реальный месяц с минимальными продажами

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void monthsWithSalesBelowAverage() {
        //5. Количество месяцев, в которых продажи были ниже среднего
        long expectedAmountMonthsWithSalesBelowAverage = 5; //ожидаемое количество месяцев, в которых продажи были ниже среднего
        long actualAmountMonthsWithSalesBelowAverage = service.monthsWithSalesBelowAverage(sales); //реальное количество месяцев, в которых продажи были ниже среднего

        Assertions.assertEquals(expectedAmountMonthsWithSalesBelowAverage, actualAmountMonthsWithSalesBelowAverage);
    }

    @Test
    public void monthsWithSalesAboveAverage() {
        //6. Количество месяцев, в которых продажи были выше среднего
        long expectedAmountMonthsWithSalesAboveAverage = 5; //ожидаемое количество месяцев, в которых продажи были выше среднего
        long actualAmountMonthsWithSalesAboveAverage = service.monthsWithSalesAboveAverage(sales); //реальное количество месяцев, в которых продажи были выше среднего

        Assertions.assertEquals(expectedAmountMonthsWithSalesAboveAverage, actualAmountMonthsWithSalesAboveAverage);
    }
}
