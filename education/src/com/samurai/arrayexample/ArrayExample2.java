package com.samurai.arrayexample;

public class ArrayExample2 {
    public static void main(String args[]) {
        int array[] = new int[50];
        int x = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                array[x] = i;
                x++;
            }
        }

        System.out.println("Вывод элементов масссива в строку");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();

        System.out.println("Вывод элементов масссива в строку в обратном порядке");
        for (int a = array.length - 1; a >= 0; a--) {
            System.out.print(array[a] + " ");
        }
    }
}
