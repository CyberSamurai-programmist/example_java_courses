package com.samurai.javaBegginerCharter1;

/**
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class example6 {
    public static void main(String[] args) {
        int number = 350;

        if (number / 100 != 0 && number / 1000 == 0) {
            System.out.println("Число являеться трехзначным");
        }

        if (number % 10 == 7) {
            System.out.println("Последняя цифра числа являеться 7(семёрка)");
        }

        if (number % 2 == 0) {
            System.out.println("Число являеться чётным");
        }
    }
}
