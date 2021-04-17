package com.COMP373.VisitorPattern;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
