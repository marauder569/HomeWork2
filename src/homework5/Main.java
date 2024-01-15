package homework5;

public class Main {
    public static void main(String[] args) {
    //Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        } else {
            System.out.println("Приложения для вашей операционной системы нет");
        }
        //Задача 2
        int clientOS1 = 0;
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке...");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке...");
        } else if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке...");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        } else {
            System.out.println("Приложения для вашей операционной системы нет");
        }
        //Задача 3
        int year = 2021;
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year >=1584) {
            System.out.println("год является високосным");
        } else  {
            System.out.println("год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 35;
        int deliveryTime1 = 1;
        int deliveryTime2 = deliveryTime1 + 1;
        int deliveryTime3 = deliveryTime2 + 1;
        if (deliveryDistance <= 20) {
            System.out.println("доставка займет " + deliveryTime1 + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("доставка займет " + deliveryTime2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("доставка займет " + deliveryTime3 + " дня");
        } else {
            System.out.println("доставки нет");
        }
        //Задача 5
        int monthNumber = 5;
        String season;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                System.out.println("нет такого месяца");
                return;
        }
        System.out.println("Месяц под номером " + monthNumber + " относится к сезону " + season + ".");
    }
}