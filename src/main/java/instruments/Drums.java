package instruments;

public class Drums extends Instrument {
    private int numOfDrums;

    public Drums(String material, String colour, InstrumentType type, double price, int numOfDrums) {
        super(material, colour, type, price);
        this.numOfDrums = numOfDrums;
    }

    public int getNumOfDrums() {
        return numOfDrums;
    }

    @Override
    public String play() {
        return "Drums playing";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
