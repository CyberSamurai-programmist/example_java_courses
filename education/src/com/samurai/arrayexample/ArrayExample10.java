package com.samurai.arrayexample;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample10 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = 0;
        int array[];

        try {
            while (true) {
                System.out.println("Введите положительное число больше 3");
                n = in.nextInt();
                if (n < 0) {
                    System.out.println("Введённое число не являеться положительным\n");
                } else if (n < 3) {
                    System.out.println("Введённое число меньше трёх\n");
                } else {
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение\n");
        }

        array = random.ints(n, 0, n).toArray();

        System.out.println("Вывод элементов масссива");

        int count = 0;

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
            if (array[a] % 2 == 0) {
                count++;
            }
        }

        int newArray[] = new int[count];

        System.out.println();

        int x = 0;
        System.out.println("Вывод элементов массива с чётными значения первого массива");
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 == 0) {
                newArray[x] = array[a];
                System.out.print(newArray[x] + " ");
                x++;
            }
        }


    }
}
