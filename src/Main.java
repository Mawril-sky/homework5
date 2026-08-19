//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// Задание 2
        int clientDeviceYear = 2015;
        switch (clientOS) {
            case '1':
                System.out.println("Установите приложение для iOS по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            default:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
        }
        // Задание 3
        int year = 2020; // сюда можно подставить любой год

        boolean isLeap;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        int deliveryDistance = 101;
        char days;
        if (deliveryDistance < 20) {
            days = '1';
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = '2';
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days = '3';
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }
        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 3:
                System.out.println("Сейчас зима");
                break;
            case 4, 5, 6:
                System.out.println("Сейчас осень");
                break;
            case 7, 8, 9:
                System.out.println("Сейчас лето");
                break;
            case 10,11,12:
            System.out.println ("Сейчас весна");
            break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}


