package com.samurai.javaBegginerCharter1;

import java.util.Random;

/**
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */
public class example10 {
    public static void main(String[] args) {
        long factorial = 1l;
        Random rand = new Random();
        int x = rand.nextInt(6) + 10;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + x + ": " + factorial);
    }
}
