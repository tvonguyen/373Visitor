package com.COMP373.VisitorPattern;

// element interface

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
