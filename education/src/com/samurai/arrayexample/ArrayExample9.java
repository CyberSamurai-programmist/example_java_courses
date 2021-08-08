package com.samurai.arrayexample;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample9 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int value = 0;
        int array[];
        int leftSum = 0;
        int rightSum = 0;

        try {
            while (true) {
                System.out.println("Введите положительное число");
                value = in.nextInt();
                if (value < 0) {
                    System.out.println("Введённое число не являеться положительным\n");
                } else {
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение\n");
        }

        array = random.ints(value, 0, 15).toArray();

        System.out.println("Вывод элементов масссива");

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }

        System.out.println();

        for (int a = 0; a < array.length / 2; a++) {
            leftSum += array[a];
        }

        for (int a = array.length / 2; a < array.length; a++) {
            rightSum += array[a];
        }

        System.out.println("Вывод суммы элементов левой части масссива: " + leftSum + "\n");
        System.out.println("Вывод суммы элементов правой части масссива: " + rightSum + "\n");

        if (leftSum > rightSum) {
            System.out.println("Сумма элементов левой части больше суммы элементов правой части массива\n");
        } else if (rightSum > leftSum) {
            System.out.println("Сумма элементов правой части больше суммы элементов левой части массива\n");
        } else if (leftSum == rightSum) {
            System.out.println("Суммы элементов правой и левой части массива равны\n");
        }

    }
}
