package Shop;

import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private ArrayList<Item> itemsForSale;

    @Before
    public void before() {
        shop = new Shop("High Notes Music Shop", itemsForSale);
    }

    @Test
    public void getShopName() {
        assertEquals("High Notes Music Shop", shop.getShopName());
    }

}