package homework4;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }
        //Задача 2
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задача 3
        int speed = 60;
        if (speed > 60 ) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        //Задача 4
            int age1 = 33;
            if (age1 < 2) {
                System.out.println("Если возраст человека  " + age1 + ", то ему еще рано куда-то ходить");
            } else if (age1 >= 2 && age1 <= 6) {
                System.out.println("Если возраст человека  " + age1 + ", то ему нужно ходить в детский сад");
            } else if (age1 >= 7 && age1 <= 17) {
                System.out.println("Если возраст человека  " + age1 + ", то ему нужно ходить в школу");
            } else if (age1 >= 18 && age1 <= 24) {
                System.out.println("Если возраст человека  " + age1 + ", то ему нужно ходить в ВУЗ");
            } else {
                System.out.println("Если возраст человека  " + age1 + ", то ему нужно ходить на работу до конца жизни");
            }
            //Задача 5
        int age2 = 13;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка  " + age2 + ", то ему ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка  " + age2 + ", то ему ему можно кататься только со взрослыми");
        } else {
            System.out.println("Если возраст ребенка  " + age2 + ", то ему ему можно кататься одному");
        }
        //Задача 6
        int capacity = 102;
        int numSeats = 60;
        int numPassengers = 102;
        if (numPassengers < numSeats) {
            System.out.println("В вагоне остались свободные сидячие места");
        } else if (numPassengers < capacity) {
            System.out.println("В вагоне остались свободные стоячие места");
        } else {
            System.out.println("В вагоне не осталось свободных мест");
        }
        //Задача 7
        int one = 1;
        int two = 20;
        int three = 7;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }
    }
}
