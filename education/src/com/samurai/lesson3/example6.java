package com.samurai.lesson3;

/**
 * Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class example6 {
    public static void main(String[] args) {

        System.out.println("Четные числа от 2 до 100 включительно ");
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
