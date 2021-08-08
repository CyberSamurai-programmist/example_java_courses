package com.samurai.javaBegginerCharter2;


/**
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
 * которых есть параметры, например <p id=”p1”>, и замену их на простые теги
 * абзацев <p>
 */
public class example23 {
    public static void main(String[] args) {

        String str = "<div>\n\t<p id = \"p1\">Язык программирования</p>\n</div>\n" +
                "<div>\n\t<p name = \"language\">Java</p>\n</div>\n" +
                "<div>\n\t<p id = \"p3\" name = \"description\">лучший в мире!</p>\n</div>";

        String newStr = str.replaceAll("<\\s*p(.*?)[^>]*>", "<p>");

        System.out.println(str);
        System.out.println("===============================================");
        System.out.println(newStr);

    }
}
