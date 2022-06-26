package instruments;

public class Piano extends Instrument {
    private int numOfKeys;

    public Piano(String material, String colour, InstrumentType type, double sellingPrice, double buyingPrice, int numOfKeys) {
        super(material, colour, type, sellingPrice, buyingPrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    @Override
    public String play() {
        return "Playing piano";
    }


}
