package com.samurai.lesson3;

/**
 * Начав тренировки, спортсмен в первый день пробежал 10 км.
 * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */
public class example1 {
    public static void main(String[] args) {
        int firstDay = 10;
        float progression = (firstDay / 100f) * 10;
        int sum = 0;

        sum += firstDay;
        for (int i = 2; i <= 7; i++) {
            firstDay += progression;
            sum += firstDay;
        }
        System.out.println("Cуммарный путь пробежал спортсмен за 7 дней " + sum + " км");
    }
}
