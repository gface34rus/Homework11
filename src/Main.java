import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear(LocalDate.now().getYear());
        getApp(1, 2013);
        System.out.println("Потребуется дней: " + calculateDelivery(10));


    }

    public static void checkYear(int year) {
        System.out.println("Задача 1");
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        System.out.println();
    }

    public static void getApp(int oS, int deviceYear) {
        System.out.println("Задача 2");
        int currentYear = 2015;
        if (oS == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (oS == 0 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");

        } else if (oS == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (oS == 1 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();
    }

    public static int calculateDelivery(int deliveryDistance) {
        System.out.println("Задача 3");
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else {
            System.out.println("В ваш район, доставка не производится.");
            return -1;
        }
    }
}
