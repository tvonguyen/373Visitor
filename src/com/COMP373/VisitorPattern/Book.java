package com.COMP373.VisitorPattern;

public class Book implements ItemElement {
    final private int price;
    final private String isbnNum;

    // a concrete class for a type of item: book

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
