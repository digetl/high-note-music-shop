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

    public int getStock() {
        return itemsForSale.size();
    }

    public Double calculateMarkup(Item item) {
       Double rrp = item.getRrpPrice();
       Double wholesale = item.getWholesalePrice();
       return rrp - wholesale;
    }

    public double calculateMarkupAllStock(Shop shop) {
        double totalProfit = 0.00;

        for (int counter = 0; counter < itemsForSale.size(); counter++) {
            totalProfit += calculateMarkup(itemsForSale.get(counter));
        }

        return totalProfit;
    }
}
