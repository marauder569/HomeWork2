package homework11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        printIsLeapYearResult(1900);
        //Задача 2
        int clientOS1 = 1;
        int clientDeviceYear = 2024;
        recomendatedAppVersion(clientDeviceYear, clientOS1);
        //Задача 3
        int deliveryDistance = 101;
        int deliveryTime = getDeliveryTime(deliveryDistance);
        if (deliveryTime == -1) {
            System.out.println("доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }
    private static int getDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            deliveryTime = -1;
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime++;
            } else if (deliveryDistance > 60) {
                deliveryTime += 2;
            }
        }
        return deliveryTime;
    }
    private static void recomendatedAppVersion(int clientDeviceYear, int clientOS1) {
        if (clientOS1 != 0 && clientOS1 != 1) {
            System.out.println("Приложения для вашей операционной системы нет");
        } else  {
            String operationSystem;
            if (clientOS1 == 0) {
                operationSystem = " iOS";
            } else {
                operationSystem = " Android";
            }
            String message;
            if (isDeviceOld(clientDeviceYear)) {
                message = "Установите облегченную версию приложения для " + operationSystem + " по ссылке...";
            } else {
                message = "Установите  версию приложения для " + operationSystem + " по ссылке...";
            }
            System.out.println(message);
        }
    }
    private static boolean isDeviceOld(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        return clientDeviceYear <= currentYear;
    }
    private static void printIsLeapYearResult(int year) {
        if (isLeap(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    private static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && year >= 1584;
    }
}
