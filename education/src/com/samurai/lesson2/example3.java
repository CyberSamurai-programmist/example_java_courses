package com.samurai.lesson2;

/**
 * Дано целое число. Если оно является положительным,
 * то прибавить к нему 1.Если отрицательным,
 * то вычесть из него 2. Если нулевым,
 * то заменить его на 10. Вывести полученное число
 */
public class example3 {
    public static void main(String[] args) {
        int number = 6;

        if (number > 0) {
            number += 1;
        } else if (number < 0) {
            number -= 2;
        } else if (number == 0) {
            number = 10;
        }
        System.out.println("Полученное число: " + number);
    }
}
