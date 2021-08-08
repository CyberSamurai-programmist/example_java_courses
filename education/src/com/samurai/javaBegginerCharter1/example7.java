package com.samurai.javaBegginerCharter1;


/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
public class example7 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int radius = 5;

        if ((Math.PI * (Math.pow(radius, 2))) > (a * b)) {
            System.out.println("Круглой картонкой радиусом r = " + radius
                    + " можно закрыть прямоугольное отверстие размерами " + a + " " + b);
        }else{
            System.out.println("Круглой картонкой радиусом r = " + radius
                    + " нельзя закрыть прямоугольное отверстие размерами " + a + " и " + b);
        }
    }
}
