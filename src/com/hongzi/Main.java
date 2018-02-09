package com.hongzi;


public class Main {

    public static void main (String[] args) {
        Printer printer = new Printer(6,20,true);

        int pageJustPrinted = printer.print(3);
        System.out.println("Page just printed: " + pageJustPrinted + " Total page printed: " + printer.getPrintedPage());
//        pageJustPrinted = printer.print(2);
//        System.out.println("Page just printed: " + pageJustPrinted + " Total page printed: " + printer.getPrintedPage());

        int currentToner = printer.getToner();
        System.out.println("Current toner level: " + currentToner);
        int currentBlankPage = printer.getBlankPage();
        System.out.println("Current blank page amount: " + currentBlankPage);
    }
}
