package items;

public class DrumSticks extends Item{

    public DrumSticks(double buyingPrice, double sellingPrice, String type) {
        super(buyingPrice, sellingPrice, type);
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
