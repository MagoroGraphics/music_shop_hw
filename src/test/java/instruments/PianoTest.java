package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("plastic", "grey", InstrumentType.CHORDOPHONE, 550.80, 64);
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
    public void hasPrice() {
        assertEquals(550.80, piano.getPrice(), 0.0);
    }

    @Test
    public void hasNumOfKeys() {
        assertEquals(64, piano.getNumOfKeys());
    }
}