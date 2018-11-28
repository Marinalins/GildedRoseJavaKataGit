package edu.insightr.gildedrose;

public class Inventory {

    private Item[] items;

    public Inventory(Item[] items) {
        super();
        this.items = items;
    }

    public Inventory() {
        super();
        items = new Item[]{
                new Vest("+5 Dexterity Vest", 10, 20),
                new Brie("Aged Brie", 2, 0),
                new Elixir("Elixir of the Mongoose", 5, 7),
                new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Conjured("Conjured Mana Cake", 3, 6)
        };

    }

    public void printInventory() {
        System.out.println("***************");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("***************");
        System.out.println("\n");
    }
/*
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != "Aged Brie"
                    && items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                if (items[i].getQuality() > 0) {
                    if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                        items[i].setQuality(items[i].getQuality() - 1);
                    }
                }
            } else {
                if (items[i].getQuality() < 50) {
                    items[i].setQuality(items[i].getQuality() + 1);

                    if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getSellIn() < 11) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }

                        if (items[i].getSellIn() < 6) {
                            if (items[i].getQuality() < 50) {
                                items[i].setQuality(items[i].getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                items[i].setSellIn(items[i].getSellIn() - 1);
            }

            if (items[i].getSellIn() < 0) {
                if (items[i].getName() != "Aged Brie") {
                    if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
                        if (items[i].getQuality() > 0) {
                            if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
                                items[i].setQuality(items[i].getQuality() - 1);
                            }
                        }
                    } else {
                        items[i].setQuality(items[i].getQuality() - items[i].getQuality());
                    }
                } else {
                    if (items[i].getQuality() < 50) {
                        items[i].setQuality(items[i].getQuality() + 1);
                    }
                }
            }
        }
    }*/

    private static void execute(Strategy strategy, Item item) {
        strategy.UpdateQuality(item);
    }

    public void updateQuality()
    {
        Strategy[] algorithms = {new StrategyItemIncrease(), new StrategyItemDecrease(), new StrategySulfuras()};
        for(int i = 0 ; i<items.length; i++)
        {/*
            if(items[i].getName().matches("(?i:.*Sulfuras.*)"))
                execute(algorithms[2],items[i]);
            if(items[i].getName().matches("(?i:.*Backstage passes.*)")  || items[i].getName().matches("(?i:.*Brie.*)"))
                execute(algorithms[0],items[i]);
            if(items[i].getName().matches("(?i:.*Conjured.*)")  || items[i].getName().matches("(?i:.*Elixir.*)") || items[i].getName().matches("(?i:.*Vest.*)"))
                execute(algorithms[1],items[i]);*/
            for (Strategy algorithm : algorithms) {
                execute(algorithm, items[i]);
            }
        }
    }

    public void updateSellIn()
    {
        for(int i = 0; i<items.length; i++)
        {
            items[i].setSellIn(items[i].getSellIn() - 1);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        for (int i = 0; i < 10; i++) {
            inventory.updateSellIn();
            inventory.updateQuality();
            inventory.printInventory();
        }
    }

    public Item[] getItems() {
        return items;
    }
}
