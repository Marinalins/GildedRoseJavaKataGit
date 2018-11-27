package edu.insightr.gildedrose;

public class BackstagePasses extends Item{
    public BackstagePasses() { super ();}

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
