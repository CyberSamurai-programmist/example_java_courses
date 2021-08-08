package com.samurai.lesson2;

/**
 * В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо
 * вывести правильно окончание. Например: • 2 программиста
 * • 1 программист • 10 программистов • и т.д.
 */
public class example7 {
    public static void main(String[] args) {
        int numberProgrammist = 12;

        if (((numberProgrammist % 10) == 1 || (numberProgrammist % 10) == 2 || (numberProgrammist % 10) == 3 ||
                (numberProgrammist % 10) == 4) && (numberProgrammist / 10) == 1) {
            System.out.println(numberProgrammist + " программистов");
        }
        else if ((numberProgrammist % 10) == 1) {
            System.out.println(numberProgrammist + " программист");
        }
        else if ((numberProgrammist % 10) == 2 || (numberProgrammist % 10) == 3 || (numberProgrammist % 10) == 4) {
            System.out.println(numberProgrammist + " программиста");
        }
        else {
            System.out.println(numberProgrammist + " программистов");
        }
    }
}
