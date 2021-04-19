package com.samurai.javaBegginerCharter1;

import java.util.Random;

/**
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class example14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = rand.ints(10, 0, 10).toArray();

        int max = 0;
        int min = 10;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nМаксимальное значение из массива: arr[" + indexMax + "] = "+ max);
        System.out.println("\nМинимальное значение из массива: arr[" + indexMin + "] = "+ min);

    }

}
