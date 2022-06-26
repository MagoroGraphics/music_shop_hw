package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("plastic", "grey", InstrumentType.CHORDOPHONE, 550.00, 100.00,64);
    }

    @Test
    public void hasMaterial() {
        assertEquals("plastic", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("grey", piano.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.CHORDOPHONE, piano.getType());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(550, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(100, piano.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasNumOfKeys() {
        assertEquals(64, piano.getNumOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing piano", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(450.00, piano.calculateMarkup(), 0.0);
    }
}