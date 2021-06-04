package com.samurai.javaBegginerCharter2;

/**
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */
public class example18 {
    public static void main(String[] args) {
        String str = "Строковый литерал - это последовательность символов, заключенных в двойные кавычки.";

        int count = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == '-') {
                count++;
            }
        }
        System.out.println("Общее кол-во знаков препинания в строке " + count);
    }
}
