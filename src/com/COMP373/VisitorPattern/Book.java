package com.COMP373.VisitorPattern;

public class Book implements ItemElement {
    private int price;
    private String isbnNum;

    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNum = isbn;
    }

    public int getPrice () {
        return price;
    }

    public String getIsbnNum() {
        return isbnNum;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
