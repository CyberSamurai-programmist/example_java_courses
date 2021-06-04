package com.samurai.arrayexample;

import java.util.Random;

public class ArrayExample4 {
    public static void main(String args[]) {
        int array[] = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println("Вывод элементов масссива");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();

        for (int a = 0; a < array.length; a++) {
            if (a % 2 != 0) {
                array[a] = 0;
            }
        }
        System.out.println();

        System.out.println("Вывод элементов нвоого масссива");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
    }
}
