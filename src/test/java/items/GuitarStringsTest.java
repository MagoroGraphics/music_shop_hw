package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    private GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(5.20, 19.99, "guitar items");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.20, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(19.99, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void hasType(){
        assertEquals("guitar items", guitarStrings.getType());
    }
}
