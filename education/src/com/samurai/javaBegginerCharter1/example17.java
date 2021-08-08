package com.samurai.javaBegginerCharter1;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
 * таким образом:
 * <p>
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class example17 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int size = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 1 || i == 2 || i == 3) && (j == 0 || j == 4) || ((i == 2) && (j == 1 || j == 3))) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
