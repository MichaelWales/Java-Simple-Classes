import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(28, 6, 16, 3);
    }

    @Test
    public void canAdd() {
        assertEquals(34, calculator.add());
    }

    @Test
    public void canSubtract() {
        assertEquals(22, calculator.subtract());
    }

    @Test
    public void canMultiply() {
        assertEquals(168, calculator.multiply());
    }

    @Test
    public void canDivide() {
        assertEquals(5.33, calculator.divide(), 0.01);
    }

}
