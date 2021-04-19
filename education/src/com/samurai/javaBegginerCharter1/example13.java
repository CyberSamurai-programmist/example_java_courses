package com.samurai.javaBegginerCharter1;

import java.util.Random;

/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее
 * из них.
 */
public class example13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = rand.ints(10, 0, 20).toArray(); // ints(кол-во, минимум, максимум)
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nНаибольшее число из последовательности: " + max);
    }
}
