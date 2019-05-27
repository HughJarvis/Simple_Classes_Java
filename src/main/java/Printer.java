public class Printer {
    private int sheetsOfPaper;
    private int tonerVolume;


    public Printer(int sheetsOfPaper, int tonerVolume) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets() {
        return this.sheetsOfPaper;
    }

    public void print(int pages, int copies) {
        if (this.sheetsOfPaper >= (pages * copies)) {
            this.sheetsOfPaper -= (pages * copies);
            this.tonerVolume -= (pages * copies);
        } else {
            System.out.println("Sorry, there isn't enough paper in the printer for that");
        }

    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}

