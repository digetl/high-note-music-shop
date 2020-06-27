package Items;


import Shop.Shop;

public class Item{


    private String name;

    public Item(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double calculateMarkup(Double wholesalePrice, Double rrpPrice) {
        return null;
    }
}
