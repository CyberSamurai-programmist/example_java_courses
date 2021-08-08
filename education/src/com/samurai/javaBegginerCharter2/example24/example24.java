package com.samurai.javaBegginerCharter2.example24;
/**
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток
 * в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения
 * двух объектов (метод должен работать аналогично compareTo в строках). Создать
 * два конструктора: получающий общее количество секунд, и часы, минуты и секунды
 * по отдельности. Сделать метод для вывода данных
 */
public class example24 {
    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(1,25,54);
        interval1.showInterval();
        System.out.println("Полное количество секунд в временом промежутке: " + interval1.getAllSecondInObject());

        System.out.println();

        TimeInterval interval2 = new TimeInterval(6000);
        interval2.showInterval();
        System.out.println("Полное количество секунд в временом промежутке: " + interval2.getAllSecondInObject());

        System.out.println();

        TimeInterval interval3 = new TimeInterval(1,40,0);
        interval3.showInterval();
        System.out.println("Полное количество секунд в временом промежутке: " + interval3.getAllSecondInObject());

        System.out.println();

        System.out.println("Равны ли два объекта -> " +interval1.compareTo(interval2));
        System.out.println("Равны ли два объекта -> " +interval2.compareTo(interval3));

    }
}
