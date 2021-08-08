package com.samurai.arrayexample;

import java.util.Random;

public class ArrayExample6 {
    public static void main(String args[]) {
        Random random = new Random();

        int array[] = random.ints(4, 0, 10).toArray();
        int count = 0;

        System.out.println("Вывод элементов масссива");

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }

        for (int a = 0; a < array.length; a++) {
            if (a == array.length - 1) {
                break;
            }
            if (array[a] < array[a + 1]) {
                count++;
            }
        }

        System.out.println();

        if (count == array.length - 1) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }

    }
}
