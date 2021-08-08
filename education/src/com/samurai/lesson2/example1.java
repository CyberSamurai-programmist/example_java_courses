package com.samurai.lesson2;

/**
 * В переменную записываем число. Надо вывести на экран сколько в этом
 * числе цифр и положительное оно или отрицательное. Например,
 * "это однозначное положительное число". Достаточно будет определить,
 * является ли число однозначным, двузначным или трехзначным и более.
 */
public class example1 {
    public static void main(String[] args) {
        int number = 53345;

        if (Math.abs(number / 1000) > 0 && Math.abs(number / 1000) < 10) {
            if (number > 0) {
                System.out.println("Это четырёхзначное положительное число");
            } else {
                System.out.println("Это четырёхзначное отрицательное число");
            }
        } else if (Math.abs(number / 100) > 0 && Math.abs(number / 100) < 10) {
            if (number > 0) {
                System.out.println("Это трёхзначное положительное число");
            } else {
                System.out.println("Это трёхзначное отрицательное число");
            }
        } else if (Math.abs(number / 10) > 0 && Math.abs(number / 10) < 10) {
            if (number > 0) {
                System.out.println("Это однозначное положительное число");
            } else {
                System.out.println("Это однозначное отрицательное число");
            }
        } else {
            if (number > 0) {
                System.out.println("Это пятизначное или более положительное число");
            } else {
                System.out.println("Это пятизначное или более отрицательное число");
            }
        }
    }
}

