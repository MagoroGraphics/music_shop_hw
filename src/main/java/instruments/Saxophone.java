package instruments;

public class Saxophone extends Instrument {
    private int numOfValves;

    public Saxophone(String material, String colour, InstrumentType type, double sellingPrice, double buyingPrice, int numOfValves) {
        super(material, colour, type, sellingPrice, buyingPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    @Override
    public String play() {
        return "Playing saxophone";
    }

}
