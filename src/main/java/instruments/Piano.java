package instruments;

public class Piano extends Instrument {
    private int numOfKeys;

    public Piano(String material, String colour, InstrumentType type, double price, int numOfKeys) {
        super(material, colour, type, price);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    @Override
    public String play() {
        return "Playing piano";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
