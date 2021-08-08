package com.samurai.lesson2;

/**
 * Даны 3 целых числа.Найти количество положительных
 * и отрицательных чисел в исходном наборе.
 */
public class example5 {
    public static void main(String[] args) {
        int a = 7;
        int b = -6;
        int c = 8;
        int countPositive = 0;
        int countNegative = 0;

        if (a > 0) {
            countPositive++;
        } else if (a < 0) {
            countNegative++;
        }
        if (b > 0) {
            countPositive++;
        } else if (b < 0) {
            countNegative++;
        }
        if (c > 0) {
            countPositive++;
        } else if (c < 0) {
            countNegative++;
        }
        System.out.println("Количество положительных: " + countPositive + " и отрицательных: " + countNegative + " чисел в исходном наборе");
    }
}

