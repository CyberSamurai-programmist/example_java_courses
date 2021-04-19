package com.samurai.javaBegginerCharter1;

/**
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 * по аналогии с примером выше.
 */
public class example3 {
    public static void main(String[] args) {
        int seconds = 4500;
        System.out.println("Минут: " + (seconds / 60) + " Секунд: " + (seconds % 60));
        System.out.println("Часов: " + (seconds / 60) / 60 + " Минут: " + (seconds / 60) + " Секунд: " + (seconds % 60));
        System.out.println("Дней: " + ((seconds / 60) / 60) / 24 + " Часов: " + (seconds / 60) / 60 + " Минут: " + (seconds / 60) + " Секунд: " + (seconds % 60));
        System.out.println("Недель: " + (((seconds / 60) / 60) / 24) / 7 + " Дней: " + ((seconds / 60) / 60) / 24 + " Часов: " + (seconds / 60) / 60 + " Минут: " + (seconds / 60) + " Секунд: " + (seconds % 60));
    }
}
