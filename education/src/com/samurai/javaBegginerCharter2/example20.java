package com.samurai.javaBegginerCharter2;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */
public class example20 {
    public static void main(String[] args) {
        String str = "  Строковый литерал - это  последовательность символов, заключенных в двойные кавычки.  ";

        String newStr = str.replaceAll("\\p{P}", "").trim();
        String[] words = newStr.split("\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words) {
            stringBuilder.append(word.charAt(word.length() - 1));
        }

        System.out.println(stringBuilder);
    }
}

