package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    public String material;
    public String colour;
    public InstrumentType type;
    public double sellingPrice;
    public double buyingPrice;

    public Instrument(String material, String colour, InstrumentType type, double sellingPrice, double buyingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}
