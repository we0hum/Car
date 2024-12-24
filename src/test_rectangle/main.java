package test_rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите степень числа: ");
        double b = scanner.nextDouble();
        System.out.println("Получившееся число: " + Math.pow(a, b));
    }
}


