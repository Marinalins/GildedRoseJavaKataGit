package edu.insightr.gildedrose;

public class StrategyItemDecrease implements Strategy {
    @Override
    public void UpdateQuality(Item item) {
        if(item.getName().matches("(?i:.*Conjured.*)"))
        {
            if (item.getSellIn() < 0) {
                item.setQuality(item.getQuality() - 4);
            } else {
                item.setQuality(item.getQuality() - 2);
            }
        }
        else if(item.getName().matches("(?i:.*Elixir.*)") || item.getName().matches("(?i:.*Vest.*)"))
        {
            if (item.getSellIn() < 0) {
                item.setQuality(item.getQuality() - 2);
            } else {
                item.setQuality(item.getQuality() - 1);
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
