package com.samurai.javaBegginerCharter2.example25;

/**
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */
public class example25 {
    public static void main(String[] args) {
        AutomateTellerMachine atm1 = new AutomateTellerMachine(100,
                100, 100);

        if (atm1.cashWithdrawal(4500)) {
            System.out.println("Операция удалась");
        } else {
            System.out.println("Операция не удалась");
        }

        atm1.addDenominationOneHundred(100);
        atm1.addDenominationTwenty(50);

        if (atm1.cashWithdrawal(1240)) {
            System.out.println("Деньги были сняты");
        } else {
            System.out.println("Операция не удалась");
        }

        atm1.addDenominationFifty(50);

        if (atm1.cashWithdrawal(1290)) {
            System.out.println("Деньги были сняты");
        } else {
            System.out.println("Операция не удалась");
        }

        atm1.addCash(100, 100, 100);

        if (atm1.cashWithdrawal(4750)) {
            System.out.println("Деньги были сняты");
        } else {
            System.out.println("Операция не удалась");
        }
    }
}
