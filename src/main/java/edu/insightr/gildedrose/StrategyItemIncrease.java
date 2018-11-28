package edu.insightr.gildedrose;

public class StrategyItemIncrease implements Strategy {
    @Override
    public void UpdateQuality(Item item) {
        if(item.getName().matches("(?i:.*Brie.*)"))
        {
            item.setQuality(item.getQuality() + 1);
        }
        else if(item.getName().matches("(?i:.*Backstage passes.*)"))
        {
            if (item.getSellIn() < 0) {
                item.setQuality(0);
            } else if (item.getSellIn() <= 5) {
                item.setQuality(item.getQuality() + 3);
            } else if (item.getSellIn() <= 10) {
                item.setQuality(item.getQuality() + 2);
            } else{
                item.setQuality(item.getQuality() + 1);
            }
        }


        if (item.getQuality() < 0) {
            item.setQuality(0);
        }
        if (item.getQuality() > 50) {
            item.setQuality(50);
        }
    }
}
