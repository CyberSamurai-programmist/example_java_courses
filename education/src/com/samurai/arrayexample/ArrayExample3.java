package com.samurai.arrayexample;

import java.util.Random;

public class ArrayExample3 {
    public static void main(String args[]) {
        int array[] = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        System.out.println("Вывод элементов масссива в строку");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        System.out.println("Вывод чётных элементов масссива в строку");
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 == 0) {
                System.out.print(array[a] + " ");
            }
        }
    }
}
