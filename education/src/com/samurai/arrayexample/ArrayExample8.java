package com.samurai.arrayexample;

import java.util.Random;

public class ArrayExample8 {
    public static void main(String args[]) {
        Random random = new Random();

        int array1[] = random.ints(10, 0, 9).toArray();
        int array2[] = random.ints(10, 0, 9).toArray();
        double array3[] = new double[10];
        int countInt = 0;


        for (int i = 0; i < 10; i++) {
            array3[i] = (double) array1[i] / array2[i];
        }
        System.out.println("Вывод элементов первого масссива");

        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + " ");
        }
        System.out.println();

        System.out.println("Вывод элементов второго масссива");

        for (int a = 0; a < array2.length; a++) {
            System.out.print(array2[a] + " ");
        }
        System.out.println();

        System.out.println("Вывод элементов третьего масссива");

        for (int a = 0; a < array3.length; a++) {
            System.out.print(array3[a] + " ");
        }
        for (int a = 0; a < array3.length; a++) {
            if (array3[a] % 1 == 0) {
                countInt++;
            }
        }
        System.out.println();

        System.out.println("В третьем масссиве " + countInt + " целых чисел");
    }
}
