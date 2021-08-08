package com.samurai.javaBegginerCharter1;

/**
 * Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями
 */
public class example16 {
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 5, 11, 6, 23, 7, 8, 2, 4};

        int max = 0;
        int min = 10;
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;

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

        for (int i = indexMin; i <= indexMax; i++) {
            sum += array[i];
        }
        System.out.println("\nСумма чисел от arr[" + indexMin + "] до arr[" + indexMax + "] => " + sum);
    }
}
