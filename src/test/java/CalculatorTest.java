import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(34, calculator.add(28, 6));
    }

    @Test
    public void canSubtract() {
        assertEquals(22, calculator.subtract(28, 6));
    }

    @Test
    public void canMultiply() {
        assertEquals(168, calculator.multiply(28, 6));
    }

    @Test
    public void canDivide() {
        assertEquals(1.71, calculator.divide(12, 7), 0.01);
    }

}
