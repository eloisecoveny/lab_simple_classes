import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(200, 100);
    }

    @Test
    public void canPrint(){
        printer.print(3, 5);
        assertEquals(185, printer.getPaperSheets());
    }

    @Test
    public void willNotPrintIfNotEnoughPaper(){
        printer.print(100, 3);
        assertEquals(200, printer.getPaperSheets());
    }

    @Test
    public void canRefillPaperSheets(){
        printer.print(3, 5);
        printer.refill();
        assertEquals(200, printer.getPaperSheets());
    }

    @Test
    public void tonerDecreasesFromPrinting(){
        printer.print(3, 5);
        assertEquals(85, printer.getToner());
    }
}
