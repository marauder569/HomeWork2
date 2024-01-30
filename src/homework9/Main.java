package homework9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] expenses = generateRandomArray();
        int totalExpenses = 0;
        for (int anInt : expenses) {
            totalExpenses = totalExpenses + anInt;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");
        //Задача 2
        int minExpense = expenses[0];
        int maxExpense = expenses[0];

        for (int expens : expenses) {

            if (expens < minExpense) {
                minExpense = expens;
            }
            if (expens > maxExpense) {
                maxExpense = expens;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");
        //Задача 3
        double averageExpense = (double) totalExpenses / expenses.length;
        System.out.printf("Средняя сумма трат за день составила %.2f рублей%n ", averageExpense);

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000 + 1) + 100_000;
        }
        return arr;
    }

}
