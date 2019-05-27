import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(240, 500);
    }

    @Test
    public void canGetSheets(){
        assertEquals(240, printer.getSheets());
    }

    @Test
    public void canGetTonerVolume(){
        assertEquals(500, printer.getTonerVolume());
    }

    @Test
    public void canPrint(){
        printer.print(5, 3);
        assertEquals(225, printer.getSheets());
    }

//    @Test
//    public void cannotPrintIfNotEnoughPaper(){
//        printer.print(50, 5);
//        assertEquals("Sorry, there isn't enough paper in the printer for that", printer.);
//    }

    @Test
    public void printingReducesTonerVolume(){
        printer.print(5, 3);
        assertEquals(485, printer.getTonerVolume());
    }
}
