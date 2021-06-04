package com.samurai.multiarrays;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MultiArraysExample1 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m = 0;

        try {
            while (true) {
                System.out.println("Введите размеры матрицы");
                System.out.println("Введите кол-во строк:");
                n = in.nextInt();
                System.out.println("Введите кол-во столбцов:");
                m = in.nextInt();
                if (n < 0 || m < 0) {
                    System.out.println("Введены отрицательные значения размерности матрицы\n");
                } else {
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение\n");
        }

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
