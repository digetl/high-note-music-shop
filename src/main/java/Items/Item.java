package Items;

import Behaviours.IDiscount;
import Behaviours.ISell;
import Shop.Shop;

public class Item extends Shop implements ISell, IDiscount {

    private Double markUp;

    public Double calculateMarkup(Double wholesalePrice, Double rrpPrice) {
        markUp = rrpPrice - wholesalePrice;
        return markUp;
    }

    public Double discountByAmount(Double amount) {
        return null;
    }

    public Double discountByPercent(Double percent) {
        return null;
    }


}
