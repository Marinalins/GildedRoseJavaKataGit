package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {
    protected Inventory inventory;
    Item[] ancienneListeItems;

    @Before
    public void setUp() {
        inventory = new Inventory();
        ancienneListeItems = inventory.getItems();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPrintInventory() {
    }

    @Test
    public void testUpdateQualityWhenSellInFinished() throws Exception{
        inventory.updateQuality();
        Item[] listeItems = inventory.getItems();
        for(int i=0; i<listeItems.length; i++)
        {
            if(ancienneListeItems[i].getSellIn() == 0)
                assertEquals(ancienneListeItems[i].getQuality() - 2,listeItems[i].getQuality() );
        }
    }

    @Test
    public void main() {
    }
}