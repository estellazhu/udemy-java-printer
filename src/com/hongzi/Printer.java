package com.hongzi;


public class Printer {

    private int toner = 100;
    private int blankPage;
    private int printedPage;
    private boolean isDuplex;

    public Printer(int toner, int blankPage, boolean isDuplex) {
        if (toner > -1 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1; // to make sure the variable is set correctly
        }
        if (blankPage > -1) {
            this.blankPage = blankPage;
        } else {
            this.blankPage = -1;
        }

        this.printedPage = 0;

        this.isDuplex = isDuplex;
    }

    public int addPaper(int newPaper) {
        if (newPaper >= 0) {
            this.blankPage += newPaper * 2;
            System.out.println("Printer -> Blank page is now " + this.blankPage);
            return this.blankPage;
        } else {
            return -1;
        }
    }

    public int addToner(int newToner) {
        if (newToner >= 0 && newToner <= 100 && this.toner + newToner <= 100) {
            this.toner += newToner;
            System.out.println("Printer -> Toner is now " + this.toner);
            return this.toner;
        } else {
            return -1;
        }
    }

    // unfinished
    public int print(int pageToPrint) {
        int totalPage = pageToPrint;
        while (pageToPrint > 0 && this.toner > 0 && this.blankPage > 0) {
            if (this.isDuplex) {
                this.toner -= 2;
            } else {
                this.toner -= 1;
            }
            this.blankPage -= 1;
            pageToPrint -= 1;
            this.printedPage += 1;
        }
        if (this.blankPage <=0) {
            System.out.print("Printer -> Please add blank paper");
        }
        if (toner <= 0) {
            System.out.print("Printer -> Please add toner");
        }
        if (pageToPrint <= 0) {
            System.out.print("Printer -> Finished printing");
        }
        return totalPage - pageToPrint;
    }

    public int getToner() {
        return toner;
    }

    public int getBlankPage() {
        return blankPage;
    }

    public int getPrintedPage() {
        return printedPage;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
