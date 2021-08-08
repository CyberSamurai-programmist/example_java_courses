package com.samurai.lesson3;

/**
 * Вычислить: 1+2+4+8+...+256
 */
public class example3 {
    public static void main(String[] args) {
        int result = 1;
        int progression = 1;

        while (progression != 256) {
            progression = progression * 2;
            result += progression;
        }
        System.out.println(result);
    }
}
