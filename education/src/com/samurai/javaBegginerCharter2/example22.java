package com.samurai.javaBegginerCharter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */
public class example22 {
    public static void main(String[] args) {

        String str = "Шестнадцатиричные числа: 0x5AAAA, 0X3ffff, 0X7FFFF, 0x89BABCE, 0x89df, 0x860, 0x48, 0x3A5";
        StringBuilder stringBuilder = new StringBuilder();

        Pattern regexp = Pattern.compile("0[xX][0-9]+[a-fA-F0-9]+");
        Matcher matcher = regexp.matcher(str);

        while (matcher.find()){
            stringBuilder.append(str, matcher.start(), matcher.end());
            stringBuilder.append(" ");
        }

        System.out.println(str);
        System.out.println(stringBuilder);

    }
}
