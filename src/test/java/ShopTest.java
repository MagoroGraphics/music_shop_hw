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
        guitar = new Guitar("wood","white", InstrumentType.STRINGS, 150.00, 70, 8);
        drums = new Drums("aluminium, polyester, brass", "black", InstrumentType.PERCUSSION, 280.00, 80, 8);
        piano = new Piano("plastic", "grey", InstrumentType.CHORDOPHONE, 550.00, 100, 64);
        saxophone = new Saxophone("brass", "brass", InstrumentType.WIND, 340.00, 100, 25);
        itemsInStock = new ArrayList<>();
        itemsInStock.add(guitar);
        itemsInStock.add(drums);
        itemsInStock.add(piano);
        itemsInStock.add(saxophone);

        drumSticks = new DrumSticks(10.00, 25.00, "drumkit items");
        guitarStrings = new GuitarStrings(5.00, 19.00, "guitar items");
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

    @Test
    public void canAddToStock() {
        Guitar guitar2 = new Guitar("plastic", "red", InstrumentType.STRINGS, 230.00, 80, 8);
        shop.addToStock(guitar2);
        assertEquals(8, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.removeFromStock();
        assertEquals(6, shop.getStock().size());
    }

    @Test
    public void canCalculatePotentialProfit(){
        assertEquals(1008, shop.calculateTotalPotentialProfit(), 0.0);
    }
}