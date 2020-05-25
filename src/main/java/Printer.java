public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public boolean readyToPrint(int pages, int copies) {
        if (this.paper >= (pages * copies)) {
            return true;
        } else {
            return false;
        }
    }

    public int print(int pages, int copies) {
        this.paper = this.paper - (pages * copies);
        this.toner = this.toner - (pages * copies);
        return this.paper & this.toner;
    }

}
