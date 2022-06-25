import instruments.*;
import interfaces.ISell;
import items.DrumSticks;
import items.GuitarStrings;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Drums drums;
    private Piano piano;
    private Saxophone saxophone;
    private ArrayList<ISell> itemsInStock;
    private DrumSticks drumSticks;
    private GuitarStrings guitarStrings;
    private SheetMusic sheetMusic;


    @Before
    public void before(){
        guitar = new Guitar("wood","white", InstrumentType.STRINGS, 150.50, 7);
        drums = new Drums("aluminium, polyester, brass", "black", InstrumentType.PERCUSSION, 280.90, 8);
        piano = new Piano("plastic", "grey", InstrumentType.CHORDOPHONE, 550.80, 64);
        saxophone = new Saxophone("brass", "brass", InstrumentType.WIND, 340.00, 25);
        itemsInStock = new ArrayList<>();
        itemsInStock.add(guitar);
        itemsInStock.add(drums);
        itemsInStock.add(piano);
        itemsInStock.add(saxophone);

        drumSticks = new DrumSticks(10.00, 25.50, "drumkit items");
        guitarStrings = new GuitarStrings(5.20, 19.99, "guitar items");
        sheetMusic = new SheetMusic(1.00, 10.00, "music sheets");
        itemsInStock.add(drumSticks);
        itemsInStock.add(guitarStrings);
        itemsInStock.add(sheetMusic);

        shop = new Shop(itemsInStock);
    }

    @Test
    public void getStock() {
        assertEquals(7, shop.getStock().size());
    }
}