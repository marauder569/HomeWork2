package homework7;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int moneyPerMonth = 15000;
        int totalMoney = 0;
        int month = 0;
        while (totalMoney < 2_459_000) {
            month++;
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + moneyPerMonth;

            System.out.println("Месяц " + month + " сумма накоплений " + totalMoney + " рублей");
        }
        //Задача 2
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
            System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print( i + " " );
        }
        //Задача 3
        System.out.println();
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            int birthRatePerYear = birthRate * population / 1000;
            int mortalityPerYear = mortality * population / 1000;
            int incomeOfThePopulation = birthRatePerYear - mortalityPerYear;
            population += incomeOfThePopulation;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //Задача 4
        double initialDeposit = 15000;
        double target = 12000000;
        double currentDeposit = initialDeposit;
        int months = 0;
        while (currentDeposit < target) {
            months++;
            currentDeposit *= 1.07;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months,currentDeposit);
        }
        System.out.printf("Через %d месяцев, Василий накопит %.2f рублей", months,currentDeposit);
        System.out.println();
        //Задача 5
        double initialDeposit1 = 15000;
        double target1 = 12000000;
        double currentDeposit1 = initialDeposit1;
        int months1 = 0;
        while (currentDeposit1 < target1) {
            months1++;
            currentDeposit1 *= 1.07;
            if (months1 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months1,currentDeposit1);
            }
        }

        //Задача 6
        System.out.println();
        double currentDeposit2 = 15000;
        int months2 = 0;
        for (months2 = 1; months2 <= 108; months2++) {
            currentDeposit2 *= 1.07;
            if (months2 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months2, currentDeposit2);
            }
        }
        System.out.printf("Через 9 лет, Василий накопит %.2f рублей", currentDeposit2);

        //Задача 7
        System.out.println();
        int firstFriday = 1;
        int daysInMonth = 31;
        for (int i = firstFriday; i <= daysInMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + " число. Не забудь про отчет.");
        }

        //Задача 8
        int ourYear = 2024;
        int yearBefore = ourYear - 200;
        int yearAfter = ourYear + 100;
        int cometFlyby = 0;
        int cometFlybyRate = 79;
        while (cometFlyby < yearAfter) {
            if (cometFlyby > yearBefore) {
                System.out.println(cometFlyby);
            }
            cometFlyby += cometFlybyRate;
        }
    }
}

