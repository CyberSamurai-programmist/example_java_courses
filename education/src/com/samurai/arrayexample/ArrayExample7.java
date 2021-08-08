package com.samurai.arrayexample;

import java.util.Random;

public class ArrayExample7 {
    public static void main(String args[]) {
        Random random = new Random();
        int array[] = random.ints(12, 0, 15).toArray();
        int max = 0;
        int index = 0;

        System.out.println("Вывод элементов масссива");

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент в массиве : индекс => " + index + " значение => " + max);
    }
}
