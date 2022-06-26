package instruments;

public class Guitar extends Instrument {

    private int numOfStrings;

    public Guitar(String material, String colour, InstrumentType type, double sellingPrice, double buyingPrice, int numOfStrings) {
        super(material, colour, type, sellingPrice, buyingPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    @Override
    public String play() {
        return "Playing guitar";
    }


}
