package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(10.50, 25.50, "drumkit items");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(10.50, drumSticks.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(25.50, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void hasType(){
        assertEquals("drumkit items", drumSticks.getType());
    }
}
