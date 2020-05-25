import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(250, 50);
    }

    @Test
    public void enoughPaper() {
        assertEquals(true, printer.readyToPrint(6, 2));
    }

    @Test
    public void notEnoughPaper() {
        Printer printer = new Printer(5, 50);
        assertEquals(false, printer.readyToPrint(6, 2));
    }

    @Test
    public void reducesPaperAndToner() {
        assertEquals(38 & 238, printer.print(6, 2));
    }

}
