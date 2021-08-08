package com.samurai.javaBegginerCharter1;

/**
 * Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
 * различны?
 */
public class example5 {
    public static void main(String[] args) {
        int number = 4434;
        int tmp1, tmp2 = 0;

        tmp1 = number % 10;
        number = number / 10;

        tmp2 = number % 10;
        number = number / 10;

        if (tmp1 != tmp2) {
            System.out.println("Присутствуют разные числа");
            return;
        }
        tmp1 = number % 10;
        number = number / 10;

        if(tmp2 != tmp1){
            return;
        }

        tmp2 = number % 10;
        if(tmp1 != tmp2){
            return;
        }
        System.out.println("Все числа одинаковые");
    }
}
