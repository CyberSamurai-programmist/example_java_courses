package com.samurai.lesson3;

/**
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class example4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int multiplier = 0;


        for (int i = 1; i <= b; i++) {
            multiplier += a;
        }
        System.out.println("Произведение " + multiplier);
    }
}
