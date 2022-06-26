package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    private Drums drums;

    @Before
    public void before(){
        drums = new Drums("aluminium, polyester, brass", "black", InstrumentType.PERCUSSION, 280.00, 50.00, 8);
    }

    @Test
    public void hasNumOfDrums() {
        assertEquals(8, drums.getNumOfDrums());
    }


    @Test
    public void hasMaterial() {
        assertEquals("aluminium, polyester, brass", drums.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("black", drums.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.PERCUSSION, drums.getType());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(280.00, drums.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(50.00, drums.getBuyingPrice(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Drums playing", drums.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(230.00, drums.calculateMarkup(), 0.0);
    }
}