import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Методы");

        System.out.println("\nзадача 1");
        getYear(2021);
        getYear(2024);
        getYear(1500);


        System.out.println("\nзадача 2");
        getApp(0, 2025);
        getApp(1, 2025);
        getApp(0, 2024);
        getApp(1, 2024);
        getApp(2, 2025);
        getApp(0, 2026);


        System.out.println("\nзадача 3");
        int deliveryDау = getOrderDeliveryTime(95);
        System.out.println("На доставку потребуется дней: " + deliveryDау);

    }

    public static void getYear(int year) {
        if (year < 1584) {
            System.out.println("Такое понятие, как високосный год, еще не существует, отсутствует Григорианский календарь");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void getApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }

    public static int getOrderDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            System.out.println("Доставки нет");
            return 0;
        }
    }


}