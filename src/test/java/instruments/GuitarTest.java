package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood","white", InstrumentType.STRINGS, 150.50, 7);
    }

    @Test
    public void hasNumOfStrings() {
        assertEquals(7, guitar.getNumOfStrings());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("white", guitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void hasPrice() {
        assertEquals(150.50, guitar.getPrice(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Playing guitar", guitar.play());
    }
}