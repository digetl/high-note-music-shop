package Items;

import Behaviours.IDiscount;
import Behaviours.ISell;
import Shop.Shop;

public class Item extends Shop implements ISell, IDiscount {

    public Double calculateMarkup(Double markUp) {
        return null;
    }

    public Double discountByAmount(Double amount) {
        return null;
    }

    public Double discountByPercent(Double percent) {
        return null;
    }


}
