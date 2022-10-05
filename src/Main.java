public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1 (1ДЗ).");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание №2 (1ДЗ).");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание №3 (1ДЗ).");
        for (int i = 0; i <= 17; i+= 2) {
            System.out.println(i);
        }
        System.out.println("Задание №4 (1ДЗ).");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задание №5 (2ДЗ).");
        for (int i = 1904; i <= 2096; i+= 4) {
            System.out.println(i + " год является високосным жи есть.");
        }
        System.out.println("Задание №6 (2ДЗ).");
        for (int i = 7; i <= 98; i+= 7) {
            System.out.println(i);
        }
        System.out.println("Задание №7 (2ДЗ).");
        for (int i = 1; i <= 512; i*= 2) {
            System.out.println(i);
        }
        System.out.println("Задание №8 (3ДЗ).");
        int bank = 29000;
        int broke = 0;
        for (int i = 1; i <= 12; i++) {
            broke = broke + bank;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + broke + " рублей.");
        }
        System.out.println("Задание №9 (3ДЗ).");
        int bank1 = 29000;
        int broke1 = 0;
        for (int i = 1; i <= 12; i++) {
            broke1 = broke1 + broke1/100;
            broke1 = broke1 + bank1;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + broke1 + " рублей.");
        }
    }
}