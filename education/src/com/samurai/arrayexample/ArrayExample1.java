package com.samurai.arrayexample;

public class ArrayExample1 {
    public static void main(String args[]) {
        int array[] = new int[10];
        int x = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[x] = i;
                x++;
            }
        }

        System.out.println("Вывод элементов масссива в строку");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        System.out.println("Вывод элементов масссива в столбец");
        for (int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }
    }
}
