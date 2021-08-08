package com.samurai.game;

import java.util.Scanner;

public class Game {

    public static void showMatrix(int[][] matrix) {
        System.out.println("\n\t 1 \t\t 2 \t\t 3 \t\t");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            System.out.print(i + 1);

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print("\t|");
                    System.out.print("X");
                    System.out.print("|\t");
                }
                if (matrix[i][j] == -1) {
                    System.out.print("\t|");
                    System.out.print("O");
                    System.out.print("|\t");
                }
                if (matrix[i][j] == 0) {
                    System.out.print("\t|");
                    System.out.print(" ");
                    System.out.print("|\t");
                }
            }
            System.out.println();
        }
    }

    public static boolean checkDraw(int[][] matrix) {
        boolean draw = false;

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count == 0) {
            draw = true;
        }
        return draw;
    }

    public static boolean checkWin(int[][] matrix, int a) {
        boolean win = false;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (j == matrix.length - 1) {
                    break;
                }
                if (matrix[i][j] != matrix[i][j + 1]) {
                    break;
                }
                if (matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == a) {
                    count++;
                }
                if (count == matrix.length - 1) {
                    win = true;
                }
            }
        }

        for (int j = 0; j < matrix.length; j++) {
            int count = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (i == matrix.length - 1) {
                    break;
                }
                if (matrix[i][j] != matrix[i + 1][j]) {
                    break;
                }
                if (matrix[i][j] == matrix[i + 1][j] && matrix[i][j] == a) {
                    count++;
                }
                if (count == matrix.length - 1) {
                    win = true;
                }
            }
        }

        int count = 0;
        for (int x = 0; x < matrix.length; x++) {
            if (x == matrix.length - 1) {
                break;
            }
            if (matrix[x][x] != matrix[x + 1][x + 1]) {
                break;
            }
            if (matrix[x][x] == matrix[x + 1][x + 1] && matrix[x][x] == a) {
                count++;
            }
            if (count == matrix.length - 1) {
                win = true;
            }
        }

        count = 0;

        int j = 0;

        for (int i = matrix.length - 1; i > 0; i--) {
            if (j == matrix.length - 1) {
                break;
            }
            if (matrix[i][j] != matrix[i - 1][j + 1]) {
                break;
            }
            if (matrix[i][j] == matrix[i - 1][j + 1] && matrix[i][j] == a) {
                count++;
            }
            if (count == matrix.length - 1) {
                win = true;
            }
            j++;
        }
        return win;
    }

    public static void game(int[][] matrix) {
        int x = 0;
        int y = 0;

        int person1 = 0;
        int person2 = 0;

        System.out.println("What will 1 player play ?");
        System.out.println("\t1.Crosses");
        System.out.println("\t2.NULLS\n");

        System.out.print("Make your choice: ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("\nThe second player will play with NULLS");
            person1 = 1;
            person2 = -1;
        } else {
            System.out.println("\nThe second player will play CROSS");
            person1 = -1;
            person2 = 1;
        }

        showMatrix(matrix);

        boolean flag = true;
        boolean check = true;

        while (flag) {
            while (check) {
                System.out.println("\n1 player makes a move (cell coordinates x y)");

                x = in.nextInt();
                y = in.nextInt();

                if (matrix[x - 1][y - 1] == 0) {
                    matrix[x - 1][y - 1] = person1;
                    check = false;
                } else {
                    System.out.println("The cell is already occupied");
                }
                showMatrix(matrix);
            }

            check = true;

            if (checkWin(matrix, person1)) {
                flag = false;
                System.out.println("\n========================================================");
                System.out.println("==================== 1 PLAYER WIN ======================");
                System.out.println("========================================================");
                break;
            }

            if (checkDraw(matrix)) {
                System.out.println("\n========================================================");
                System.out.println("======================== DRAW ===========================");
                System.out.println("========================================================");
                flag = false;
                break;
            }

            while (check) {
                System.out.println("\n2 player makes a move (cell coordinates x y)");

                x = in.nextInt();
                y = in.nextInt();

                if (matrix[x - 1][y - 1] == 0) {
                    matrix[x - 1][y - 1] = person2;
                    check = false;
                } else {
                    System.out.println("The cell is already occupied");
                }
                showMatrix(matrix);
            }

            check = true;

            if (checkWin(matrix, person2)) {
                flag = false;
                System.out.println("\n========================================================");
                System.out.println("==================== 2 PLAYER WIN ======================");
                System.out.println("========================================================");
                break;
            }

            if (checkDraw(matrix)) {
                System.out.println("\n========================================================");
                System.out.println("======================== DRAW ===========================");
                System.out.println("========================================================");
                flag = false;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        System.out.println("========================================================");
        System.out.println("================= Tic-tac-toe game =====================");
        System.out.println("========================================================");

        boolean flag = true;

        Scanner in = new Scanner(System.in);
        try {
            while (flag) {
                System.out.println(" Menu");
                System.out.println("\t1.Start the game");
                System.out.println("\t0.Exit the application\n");
                System.out.print("Make your choice: ");
                int choice = in.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println();
                        System.out.println("========================================================");
                        System.out.println("=============== Beginning of the game ==================");
                        System.out.println("========================================================");
                        game(matrix);
                        flag = false;
                        break;
                    }
                    case 0: {
                        return;
                    }
                }
            }
        } catch (Exception err) {
            System.out.println("Error " + err);
        }

    }
}
