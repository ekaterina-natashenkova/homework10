import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Методы");

        System.out.println("\nзадача 1");
        int year = 2021;
        getYear(year);


        System.out.println("\nзадача 2");
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2024;
        int clientOS = 0;
        getApp(clientOS, clientDeviceYear, currentYear);


        System.out.println("\nзадача 3");
        int deliveryDistance = 95;
        getOrderDeliveryTime(deliveryDistance);

    }

    public static int getYear(int year) {
        if (year < 1584) {
            System.out.println("такое понятие, как високосный год, еще не существует");
            return year;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
            return year;
        } else {
            System.out.println(year + " год — невисокосный год");
            return year;
        }
    }

    public static int getApp(int clientOS, int clientDeviceYear, int currentYear) {
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            return 1;
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            return 2;
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            return 3;
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
            return 4;
        } else {
            System.out.println("Вы ввели некорректные данные");
            return 0;
        }


    }

    public static int getOrderDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
            return 1;
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
            return 2;
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
            return 3;
        } else {
            System.out.println("Доставки нет");
            return 0;
        }
    }


}