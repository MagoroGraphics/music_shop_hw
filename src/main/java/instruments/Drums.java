package instruments;

public class Drums extends Instrument {
    private int numOfDrums;

    public Drums(String material, String colour, InstrumentType type, double sellingPrice, double buyingPrice, int numOfDrums) {
        super(material, colour, type, sellingPrice, buyingPrice);
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    @Override
    public String play() {
        return "Drums playing";
    }

}
