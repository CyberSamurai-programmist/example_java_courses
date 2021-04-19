package com.samurai.javaBegginerCharter1;

/**
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class example11 {
    public static void main(String[] args) {
        int number = 318;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if ((number % i == 0) && i != 1 && i != number) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Число не являеться простым");
        } else {
            System.out.println("Число являеться простым");
        }
    }
}
