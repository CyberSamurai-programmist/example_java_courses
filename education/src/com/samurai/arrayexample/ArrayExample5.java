package com.samurai.arrayexample;

import java.util.Random;

public class ArrayExample5 {
    public static void main(String args[]) {

        Random random = new Random();

        int array1[] = new int[5];
        //int array1[] = random.ints(5,0,15).toArray();
        int array2[] = new int[5];
        //int array2[] = random.ints(5,0,15).toArray();
        double sumArray1 = 0;
        double sumArray2 = 0;
        double averageArray1 = 0;
        double averageArray2 = 0;


        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
            array2[i] = random.nextInt(15);
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

        for (int x = 0; x < array2.length; x++) {
            sumArray1 += array1[x];
            sumArray2 += array2[x];
        }
        averageArray1 = sumArray1 / array1.length;
        averageArray2 = sumArray2 / array2.length;

        System.out.println();

        System.out.println("Cреднее арифметическое значение элементов первого массива: " + averageArray1);
        System.out.println("Cреднее арифметическое значение элементов первого массива: " + averageArray2);

        System.out.println();

        if (averageArray1 > averageArray2) {
            System.out.println("Cреднее арифметическое значение первого массива большего второго массива");
        } else if (averageArray2 > averageArray1) {
            System.out.println("Cреднее арифметическое значение второго массива большего первого массива");
        } else if (averageArray1 == averageArray2) {
            System.out.println("Cреднее арифметическое значение первого и второго массива равны");
        }
    }
}
