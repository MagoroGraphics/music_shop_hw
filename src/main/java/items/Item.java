package items;

import interfaces.ISell;

public abstract class Item implements ISell {
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

    public double calculateMarkup(){
        return this. sellingPrice - this.buyingPrice;
    }
}
