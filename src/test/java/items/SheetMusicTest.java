package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(1.00, 10.00, "music sheets");
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1.00, sheetMusic.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(10.00, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void hasType(){
        assertEquals("music sheets", sheetMusic.getType());
    }
}
