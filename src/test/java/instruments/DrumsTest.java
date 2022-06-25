package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    private Drums drums;

    @Before
    public void before(){
        drums = new Drums("aluminium, polyester, brass", "black", InstrumentType.PERCUSSION, 280.90, 8);
    }

    @Test
    public void getNumOfDrums() {
        assertEquals(8, drums.getNumOfDrums());
    }


    @Test
    public void getMaterial() {
        assertEquals("aluminium, polyester, brass", drums.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("black", drums.getColour());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.PERCUSSION, drums.getType());
    }

    @Test
    public void getPrice() {
        assertEquals(280.90, drums.getPrice(), 0.0);
    }
}