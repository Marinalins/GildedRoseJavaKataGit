package edu.insightr.gildedrose;

public class StrategySulfuras implements Strategy {
    @Override
    public void UpdateQuality(Item item) {
        if(item.getName().matches("(?i:.*Sulfuras.*)"))
            item.setQuality(80);
    }
}
