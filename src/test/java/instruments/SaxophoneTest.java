package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SaxophoneTest {

    private Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("brass", "brass", InstrumentType.WIND, 340.00, 80, 25);
    }

    @Test
    public void hasNumOfValves() {
        assertEquals(25, saxophone.getNumOfValves());
    }

    @Test
    public void hasMaterial() {
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("brass", saxophone.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.WIND, saxophone.getType());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(340.00, saxophone.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(80, saxophone.getBuyingPrice(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Playing saxophone", saxophone.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(260, saxophone.calculateMarkup(),0.0);
    }
}

