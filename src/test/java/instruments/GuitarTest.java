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
    public void getNumOfStrings() {
        assertEquals(7, guitar.getNumOfStrings());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("white", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void getPrice() {
        assertEquals(150.50, guitar.getPrice());
    }
}