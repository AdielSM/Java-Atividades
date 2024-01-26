package DesafiosAula.EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount >= 0 && tonerAmount <= 100) {
            this.tonerLevel += Math.min(tonerAmount, 100 - this.tonerLevel);
            return this.tonerLevel;
        }

        return -1;
    }

    public int printPages(int pages){
        int jobPages = duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
