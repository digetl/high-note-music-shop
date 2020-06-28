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
    private Item item1;

    @Before
    public void before() {
        snaredrum = new Percussion("Ludwig big snare", 200.00, 100.00, PercussionInst.SNAREDRUM1);
        item1 = new Item("DrumSticks", 10.00,20.00);
        shop = new Shop("High Notes Music Shop", itemsForSale);
    }

    @Test
    public void getShopName() {
        assertEquals("High Notes Music Shop", shop.getShopName());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addItemToStock(snaredrum);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(snaredrum);
        shop.removeItemFromStock(snaredrum);
        assertEquals(0, shop.getStock());

    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, shop.calculateMarkup(item1), 0.01);
    }

    @Test
    public void canCalculateMarkUpOnAllStock__Instruments_Only(){

        shop.addItemToStock(snaredrum);
        shop.addItemToStock(snaredrum);
        shop.removeItemFromStock(snaredrum);
        assertEquals(0, shop.calculateMarkupAllStock());

    }

}