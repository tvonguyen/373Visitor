package com.COMP373.VisitorPattern;

public class Fruit implements ItemElement {

    private int pricePerLb;
    private int weight;
    private String name;

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
