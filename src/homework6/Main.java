package homework6;

public class Main {
    public static void main(String[] args) {
    //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
    //Задача 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Четное число " + i);
        }
    //Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    //Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
    //Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }
    //Задача 7
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
    //Задача 8
        int stash = 29000;
        int totalStash = 0;
        for (int i = 1; i <= 12; i++) {
            totalStash = totalStash + stash;
            System.out.println("Месяц " + i + ", сумма накоплений " + totalStash + " рублей");
        }
    //Задача 9
        int stash1 = 29000;
        int totalStash1 = 0;
        for (int i = 1; i <= 12; i++) {
            totalStash1 = totalStash1 + totalStash1 / 100;
            totalStash1 = totalStash1 + stash1;
            System.out.println("Месяц " + i + ", сумма накоплений " + totalStash1 + " рублей");
        }
    //Задача 10
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + a * i);
        }
    }
}