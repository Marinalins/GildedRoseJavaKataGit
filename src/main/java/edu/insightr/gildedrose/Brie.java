package edu.insightr.gildedrose;

public class Brie extends Item{
    public Brie(){super();}

    public Brie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
