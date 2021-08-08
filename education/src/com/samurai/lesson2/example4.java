package com.samurai.lesson2;

/**
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
public class example4 {
    public static void main(String[] args) {
        int a = 7;
        int b = -6;
        int c = 8;
        int count = 0;

        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }
        System.out.println("Количество положительных чисел в исходном наборе: " + count);
    }
}
