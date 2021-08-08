package com.samurai.javaBegginerCharter2.example25;

public class AutomateTellerMachine {
    private int countDenominationTwenty;
    private int countDenominationFifty;
    private int countDenominationOneHundred;


    public AutomateTellerMachine(int countDenominationTwenty, int countDenominationFifty, int countDenominationOneHundred) {
        this.countDenominationTwenty = countDenominationTwenty;
        this.countDenominationFifty = countDenominationFifty;
        this.countDenominationOneHundred = countDenominationOneHundred;
    }

    public void addCash(int countDenominationTwenty, int countDenominationFifty, int countDenominationOneHundred) {
        this.countDenominationTwenty += countDenominationTwenty;
        this.countDenominationFifty += countDenominationFifty;
        this.countDenominationOneHundred += countDenominationOneHundred;

        System.out.println("\n==========================================================");
        System.out.println("Банкомат пополнен купюрами в количестве: ");
        System.out.println("Купюр номиналом 20  добавлено " + countDenominationTwenty + " штук");
        System.out.println("Купюр номиналом 50 добавлено " + countDenominationFifty + " штук");
        System.out.println("Купюр номиналом 100 добавлено " + countDenominationOneHundred + " штук");
        System.out.println("==========================================================");
    }

    public void addDenominationTwenty(int countDenominationTwenty) {
        this.countDenominationTwenty += countDenominationTwenty;
        System.out.println("\n==========================================================");
        System.out.println("Банкомат пополнен купюрами в количестве: ");
        System.out.println("Купюр номиналом 20  добавлено " + countDenominationTwenty + " штук");
        System.out.println("==========================================================");
    }

    public void addDenominationFifty(int countDenominationFifty) {
        this.countDenominationFifty += countDenominationFifty;
        System.out.println("\n==========================================================");
        System.out.println("Банкомат пополнен купюрами в количестве: ");
        System.out.println("Купюр номиналом 50 добавлено " + countDenominationFifty + " штук");
        System.out.println("==========================================================");
    }

    public void addDenominationOneHundred(int countDenominationOneHundred) {
        this.countDenominationOneHundred += countDenominationOneHundred;
        System.out.println("\n==========================================================");
        System.out.println("Банкомат пополнен купюрами в количестве: ");
        System.out.println("Купюр номиналом 100 добавлено " + countDenominationOneHundred + " штук");
        System.out.println("==========================================================");
    }

    public boolean cashWithdrawal(int sum) {
        System.out.println("+========================================================+");

        if (sum % 100 == 30 || sum % 100 == 10) {
            System.out.println("Запрошенная сумма не может быть выдана," +
                    "\nтак ка не имееться необходимых купюр в банкомате");
            return false;
        }
        if ((sum % 100) == 0 && this.countDenominationOneHundred >= (sum / 100)) {
            System.out.println("==========================================================");
            System.out.println("Запрошенная сумма: " + sum +
                    "\nможет быть выдана купюрами номиналом 100 в кол-ве " + (sum / 100));
            this.countDenominationOneHundred -= (sum / 100);
            return true;
        } else if ((sum % 100) == 0 && this.countDenominationOneHundred < (sum / 100)) {
            System.out.println("==========================================================");
            System.out.println("Запрошенная сумма может быть выдана купюрами номиналом 100" +
                    "\nно в банкомате не хватает купюр данного номинала");
        } else if (sum % 100 != 0 && this.countDenominationOneHundred >= (sum / 100)) {
            System.out.println("Запрошеная сумма не может быть выдана купюрами номиналом 100");
            if ((sum % 100) % 50 == 0 && this.countDenominationFifty >= ((sum % 100) / 50)) {
                System.out.println("==========================================================");
                System.out.println("Запрошенная сумма: " + sum +
                        "\nможет быть выдана купюрами номиналом 100 в кол-ве " + (sum / 100) +
                        "\nи купюрами номиналом 50 в кол-ве " + ((sum % 100) / 50));
                this.countDenominationOneHundred -= (sum / 100);
                this.countDenominationFifty -= ((sum % 100) / 50);
                return true;
            } else if ((sum % 100) % 50 == 0 && this.countDenominationFifty < ((sum % 100) / 50)) {
                System.out.println("==========================================================");
                System.out.println("Запрошеная сумма может быть выдана купюрами номиналом 100 и 50" +
                        "н\nо в банкомате не хватает купюр данного номинала 50");
            } else if ((sum % 100) % 50 != 0 && this.countDenominationFifty >= ((sum % 100) / 50)) {
                System.out.println("==========================================================");
                System.out.println("Запрошеная сумма не может быть выдана купюрами номиналом 100 и 50");
                if ((((sum % 100) % 50)) % 20 == 0 && this.countDenominationTwenty >= (((sum % 100) % 50)) / 20) {
                    System.out.println("==========================================================");
                    System.out.println("Запрошенная сумма: " + sum +
                            "\nможет быть выдана купюрами номиналом 100 в кол-ве " + (sum / 100));
                    if (((sum % 100) / 50) != 0) {
                        System.out.println("и купюрами номиналом 50 в кол-ве " + ((sum % 100) / 50));
                    }

                    System.out.println("и купюрами номиналом 20 в кол-ве " + (((sum % 100) % 50) / 20));
                    this.countDenominationOneHundred -= (sum / 100);
                    this.countDenominationFifty -= ((sum % 100) / 50);
                    this.countDenominationTwenty -= (((sum % 100) % 50) / 20);
                    return true;
                } else if ((((sum % 100) % 50)) % 20 == 0 && this.countDenominationTwenty < (((sum % 100) % 50)) / 20) {
                    System.out.println("==========================================================");
                    System.out.println("Запрошеная сумма может быть выдана купюрами номиналом 100, 50, 20" +
                            "\nно в банкомате не хватает купюр данного номинала 20");
                }
            } else if (this.countDenominationFifty < ((sum % 100) / 50)) {
                System.out.println("==========================================================");
                System.out.println("Запрошеная сумма не может быть выдана купюрами номиналом 100 и 50" +
                        "\nтак как в банкомате не хватает купюр данного номинала");
            } else if (this.countDenominationTwenty < ((sum % 100) / 20)) {
                System.out.println("==========================================================");
                System.out.println("Запрошеная сумма не может быть выдана купюрами номиналом 100 и 20" +
                        "\nтак как в банкомате не хватает купюр данного номинала");
            }
        }

        if ((sum % 50) == 0 && this.countDenominationFifty >= (sum / 50)) {
            System.out.println("==========================================================");
            System.out.println("Запрошенная сумма: " + sum +
                    "\nможет быть выдана купюрами номиналом 50 в кол-ве " + (sum / 50));
            this.countDenominationFifty -= (sum / 50);
        } else if ((sum % 50) != 0 && this.countDenominationFifty >= (sum / 50)) {
            System.out.println("==========================================================");
            System.out.println("Запрошеная сумма не может быть выдана только купюрами номиналом 50");
        } else if ((sum % 50) == 0 && this.countDenominationFifty < (sum / 50)) {
            System.out.println("==========================================================");
            System.out.println("Запрошеная сумма может быть выдана купюрами номиналом 50" +
                    "\nно в банкомате не хватает купюр данного номинала ");
        }

        if ((sum % 20) == 0 && this.countDenominationTwenty >= (sum / 20)) {
            System.out.println("==========================================================");
            System.out.println("Запрошенная сумма: " + sum +
                    "\nможет быть выдана купюрами номиналом 20 в кол-ве " + (sum / 20));
            this.countDenominationTwenty -= (sum / 20);
        } else if ((sum % 20) != 0 && this.countDenominationTwenty >= (sum / 20)) {
            System.out.println("==========================================================");
            System.out.println("Запрошеная сумма не может быть выдана только купюрами номиналом 20");
        } else if ((sum % 20) == 0 && this.countDenominationTwenty < (sum / 20)) {
            System.out.println("==========================================================");
            System.out.println("Запрошеная сумма может быть выдана купюрами номиналом 20" +
                    "\nно в банкомате не хватает кюпюр данного номинала");
        }

        System.out.println("+========================================================+\n");

        return false;
    }

}
