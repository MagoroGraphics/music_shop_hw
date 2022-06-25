package instruments;

public class Piano extends Instrument{
    private int numOfKeys;

    public Piano(String material, String colour, InstrumentType type, double price, int numOfKeys) {
        super(material, colour, type, price);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
