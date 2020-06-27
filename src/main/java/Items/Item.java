package Items;

import Behaviours.ISell;

public class Item {


    private String name;
    private Double wholesalePrice;
    private Double rrpPrice;

    public Item(String name, Double wholesalePrice, Double rrpPrice) {
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.rrpPrice = rrpPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWholesalePrice() {
        return wholesalePrice;
    }

    public Double getRrpPrice() {
        return rrpPrice;
    }
}
