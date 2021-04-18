package com.COMP373.VisitorPattern;

public class Fruit implements ItemElement {

    final private int pricePerLb;
    final private int weight;
    final private String name;

    // a concrete class for a type of item: fruit

    public Fruit(int priceLb, int wt, String nm) {
        this.pricePerLb = priceLb;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerLb() {
        return pricePerLb;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
