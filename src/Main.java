public class Main {
    public static void main(String[] args) {
        /* Задание 1. */
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        /* Задание 2. */
        int clientDeviceYear = 2012;
        String operationSystem;

        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для" + " " + operationSystem + " " + "по ссылке");
        } else {
            System.out.println("Установите версию приложения для" + " " + operationSystem + " " + "по ссылке");
        }


        /* Задание 3. */
        int year = 1535;

        if ((year % 4 == 0 && year % 100 != 0 && year > 1584) || (year % 400 == 0 && year > 1584)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " " + "год не является високосным");
        }

        /* Задание 4. */
        int deliveryDistance = 165;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }

        /* Задание 5. */
        int monthNumber = 4;

        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}