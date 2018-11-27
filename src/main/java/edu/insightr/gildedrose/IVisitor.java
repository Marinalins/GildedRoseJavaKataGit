package edu.insightr.gildedrose;

interface IVisitor {
    void visit(BackstagePasses backstagePasses);
    void visit(Brie brie);
    void visit(Conjured conjured);
    void visit(Elixir elixir);
    void visit(Sulfuras sulfuras);
    void visit(Vest vest);
}
