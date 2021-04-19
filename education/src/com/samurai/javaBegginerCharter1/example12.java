package com.samurai.javaBegginerCharter1;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class example12 {
    public static void main(String[] args) {
        int number = 13;
        int sum = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
            if (count == number) {
                System.out.println("Сумма первых: " + number
                        + " целых чисел, которые деляться на 3 равняется  => " + sum);
                return;
            }
        }
    }
}
