import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void has100Volume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkRemoves10() {
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void canEmpty() {
        assertEquals(0, waterBottle.empty());
    }

}
