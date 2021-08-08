package com.samurai.javaBegginerCharter1;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */
public class example4 {
    public static void main(String[] args) {
        int number = 5235;
        int tmp1 = 0;
        int newNumber = 0;

        tmp1 = number % 10;
        number = number / 10;
        newNumber += tmp1;
        newNumber *= 10;

        tmp1 = number % 10;
        number = number / 10;
        newNumber += tmp1;
        newNumber *= 10;

        tmp1 = number % 10;
        number = number / 10;
        newNumber += tmp1;
        newNumber *= 10;

        tmp1 = number % 10;
        newNumber += tmp1;

        System.out.println(newNumber);
    }
}
