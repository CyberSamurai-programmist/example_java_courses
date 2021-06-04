package com.samurai.javaBegginerCharter2;


/**
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
public class example21 {
    public static void main(String[] args) {
        String[] str = {"Строковый литерал - это  последовательность символов, заключенных в двойные кавычки.",
                "Строковый литерал - это  последовательность символов, заключенных в двойные кавычки.",
                "Строковый литерал - это  последовательность символов, заключенных в двойные кавычки.",
                "Строковый литерал - это  последовательность символов, заключенных в двойные кавычки.",
                "Строковый литерал - это  последовательность символов, заключенных в двойные кавычки."};

        String newStr = "";

        long startLoopString = System.currentTimeMillis();
        for (String s : str) {
            newStr += s;
        }
        long endLoopString = System.currentTimeMillis();

        System.out.println("\n" + newStr);
        System.out.println("Время выполнения кокатенации "
                + (endLoopString - startLoopString) + " мс");


        StringBuilder stringBuilder = new StringBuilder();

        long startLoopStringBuilder = System.currentTimeMillis();
        for (String s : str) {
            stringBuilder.append(s);
        }
        long endLoopStringBuilder = System.currentTimeMillis();

        System.out.println("\n" + stringBuilder);
        System.out.println("Время выполнения метода append в StringBuilder "
                + (endLoopStringBuilder - startLoopStringBuilder) + " мс");


        StringBuffer stringBuffer = new StringBuffer();

        long startLoopStringBuffer = System.currentTimeMillis();
        for (String s : str) {
            stringBuffer.append(s);
        }
        long endLoopStringBuffer = System.currentTimeMillis();

        System.out.println("\n" + stringBuffer);
        System.out.println("Время выполнения метода append в StringBuffer "
                + (endLoopStringBuffer - startLoopStringBuffer) + " мс");

    }
}
