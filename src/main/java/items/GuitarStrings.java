package items;

public class GuitarStrings extends Item{
    public GuitarStrings(double buyingPrice, double sellingPrice, String type) {
        super(buyingPrice, sellingPrice, type);
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
