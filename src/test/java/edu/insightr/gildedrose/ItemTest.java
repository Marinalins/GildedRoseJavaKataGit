package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    protected Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item("Sulfuras",2,80);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() throws Exception{
        assertNotNull(item.getName());
        assertTrue(item.getName()!="");
    }

    @Test
    public void setName() throws Exception{
    }

    @Test
    public void getSellIn() throws Exception{
        if(item.getName().matches(".*Sulfuras.*"))
            assertEquals(item.getSellIn(),0);
    }

    @Test
    public void setSellIn() throws Exception{
    }

    @Test
    public void getQuality() throws Exception{
        assertTrue(item.getQuality()>0);
        if(item.getName().matches(".*Sulfuras.*"))
            assertEquals(item.getQuality(),80);
        else
            assertTrue(item.getQuality()<50);
    }

    @Test
    public void setQuality() throws Exception{
    }
}