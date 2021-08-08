package com.samurai.javaBegginerCharter1;

import java.util.Random;

/**
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */
public class example8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();

        if (((x % 10) == 1 || (x % 10) == 2 || (x % 10) == 3 || (x % 10) == 4) && (x / 10) == 1) {
            System.out.println(x + " рублей");
        }
        else if ((x % 10) == 1) {
            System.out.println(x + " рубль");
        }
        else if ((x % 10) == 2 || (x % 10) == 3 || (x % 10) == 4) {
            System.out.println(x + " рубля");
        }
        else {
            System.out.println(x + " рублей");
        }
    }
}
