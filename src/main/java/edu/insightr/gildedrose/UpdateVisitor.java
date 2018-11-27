package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor {

    @Override
    public void visit(BackstagePasses backstagePasses) {
        if (backstagePasses.getSellIn() < 0) {
            backstagePasses.setQuality(0);
        } else if (backstagePasses.getSellIn() <= 5) {
            backstagePasses.setQuality(backstagePasses.getQuality() + 3);
        } else if (backstagePasses.getSellIn() <= 10) {
            backstagePasses.setQuality(backstagePasses.getQuality() + 2);
        } else{
            backstagePasses.setQuality(backstagePasses.getQuality() + 1);
        }
        if (backstagePasses.getQuality() < 0) {
            backstagePasses.setQuality(0);
        }
        if (backstagePasses.getQuality() > 50) {
            backstagePasses.setQuality(50);
        }
    }

    @Override
    public void visit(Brie brie) {
        brie.setQuality(brie.getQuality() + 1);
        if (brie.getQuality() < 0) {
            brie.setQuality(0);
        }
        if (brie.getQuality() > 50) {
            brie.setQuality(50);
        }
    }

    @Override
    public void visit(Conjured conjured) {
        if (conjured.getSellIn() < 0) {
            conjured.setQuality(conjured.getQuality() - 4);
        } else {
            conjured.setQuality(conjured.getQuality() - 2);
        }
        if (conjured.getQuality() < 0) {
            conjured.setQuality(0);
        }
        if (conjured.getQuality() > 50) {
            conjured.setQuality(50);
        }
    }

    @Override
    public void visit(Elixir elixir) {
        if (elixir.getSellIn() < 0) {
            elixir.setQuality(elixir.getQuality() - 2);
        } else {
            elixir.setQuality(elixir.getQuality() - 1);
        }
        if (elixir.getQuality() < 0) {
            elixir.setQuality(0);
        }
        if (elixir.getQuality() > 50) {
            elixir.setQuality(50);
        }
    }

    @Override
    public void visit(Sulfuras sulfuras) {
        sulfuras.setQuality(80);
    }

    @Override
    public void visit(Vest vest) {
        if (vest.getSellIn() < 0) {
            vest.setQuality(vest.getQuality() - 2);
        } else {
            vest.setQuality(vest.getQuality() - 1);
        }

        if (vest.getQuality() < 0) {
            vest.setQuality(0);
        }
        if (vest.getQuality() > 50) {
            vest.setQuality(50);
        }
    }
}
