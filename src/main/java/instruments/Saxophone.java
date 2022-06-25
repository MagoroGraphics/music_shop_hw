package instruments;

public class Saxophone extends Instrument {
    private int numOfValves;

    public Saxophone(String material, String colour, InstrumentType type, double price, int numOfValves) {
        super(material, colour, type, price);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    @Override
    public String play() {
        return "Playing saxophone";
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
