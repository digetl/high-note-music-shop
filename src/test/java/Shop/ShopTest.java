package Shop;

import Items.Instruments.Percussion.Percussion;
import Items.Instruments.Percussion.PercussionInst;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private ArrayList<Item> itemsForSale;
    private Percussion snaredrum;

    @Before
    public void before() {
        snaredrum = new Percussion("Ludwig big snare", PercussionInst.SNAREDRUM1);
        shop = new Shop("High Notes Music Shop", itemsForSale);
    }

    @Test
    public void getShopName() {
        assertEquals("High Notes Music Shop", shop.getShopName());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemToStock(snaredrum);
    }

}