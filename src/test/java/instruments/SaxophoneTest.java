package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SaxophoneTest {

    private Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("brass", "brass", InstrumentType.WIND, 340.00, 25);
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
    public void hasPrice() {
        assertEquals(340.00, saxophone.getPrice(), 0.0);
    }
}