package Shop;

import Behaviours.ISell;
import Items.Item;

import java.util.ArrayList;

public class Shop implements ISell {

    private String shopName;
    private ArrayList<Item> itemsForSale;

    public Shop(String shopName, ArrayList<Item> itemsForSale) {
        this.shopName = shopName;
        this.itemsForSale = new ArrayList<Item>();
    }

    public void addItemToStock(Item item) {
        itemsForSale.add(item);
    }

    public void removeItemFromStock(Item item) {
        itemsForSale.remove(item);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getStock() {
        return itemsForSale.size();
    }

    public Double calculateMarkup(Double wholesalePrice, Double rrpPrice) {
        return null;
    }
}
