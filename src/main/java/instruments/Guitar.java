package instruments;

public class Guitar extends Instrument {

    private int numOfStrings;

    public Guitar(String material, String colour, InstrumentType type, double price, int numOfStrings) {
        super(material, colour, type, price);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public String play() {
        return "Playing guitar";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
