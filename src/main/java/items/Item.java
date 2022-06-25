package items;

public abstract class Item {
    public double buyingPrice;
    public double sellingPrice;
    public String type;

    public Item(double buyingPrice, double sellingPrice, String type) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.type = type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public String getType() {
        return type;
    }
}
