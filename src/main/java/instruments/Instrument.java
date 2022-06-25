package instruments;

public abstract class Instrument {

    public String material;
    public String colour;
    public InstrumentType type;
    public double price;

    public Instrument(String material, String colour, InstrumentType type, double price) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.price = price;
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

    public double getPrice() {
        return price;
    }
}
