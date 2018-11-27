package edu.insightr.gildedrose;

public class Sulfuras extends Item{
    public Sulfuras(){super();}

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
