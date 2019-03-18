public class Printer {

    private int paperSheets;
    private int toner;

    public Printer(int paperSheets, int toner){
        this.paperSheets = paperSheets;
        this.toner = toner;
    }


    public int getPaperSheets(){
        return paperSheets;
    }

    public int getToner(){
        return toner;
    }

    public void print(int docPages, int copies){
        if(paperSheets >= (docPages * copies) && toner >= (docPages * copies)) {
            this.paperSheets -= (docPages * copies);
            this.toner -= (docPages * copies);
        }
    }

    public void refill(){
        paperSheets = 200;
    }
}
