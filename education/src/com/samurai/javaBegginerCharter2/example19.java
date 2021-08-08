package com.samurai.javaBegginerCharter2;

/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */
public class example19 {
    public static void main(String[] args) {
        String str = "  Строковый литерал - это  последовательность символов, заключенных в двойные кавычки.  ";

        String newStr = str.replaceAll("\\p{P}", "").trim();
        String[] words = newStr.split("\s+");

        System.out.println("Количество слов в строке " + words.length);

    }
}
