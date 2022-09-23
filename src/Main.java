public class Main {
    public static void main(String[] args) {
        ///ДЗ 1
        ///Задание 1
        System.out.println("  ДЗ 1. Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        ///Задание 2
        System.out.println("  ДЗ 1. Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        ///Задание 3
        System.out.println("  ДЗ 1. Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        ///Задание 4
        System.out.println("  ДЗ 1. Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        ///ДЗ 2
        ///Задание 1
        System.out.println("  ДЗ 2. Задание 1");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y);
        }

        ///Задание 2
        System.out.println("  ДЗ 2. Задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        ///Задание 3
        System.out.println("  ДЗ 2. Задание 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        ///ДЗ 3
        ///Задание 1
        System.out.println("  ДЗ 3. Задание 1");
        int mounth = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + mounth;
            System.out.println("Месяц " + i + ", сумма накоплений равно " + total + " рублей");
        }

        ///Задание 2
        System.out.println("  ДЗ 3. Задание 3");
        float mounth1 = 29000;
        float total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + mounth1;
            System.out.println("Месяц " + i + ", сумма накоплений равно " + total1 + " рублей");
        }
    }
}
