package com.COMP373.VisitorPattern;

public interface ShoppingCartVisitor {
    int visit(Fruit fruit);
    int visit(Book book);

}
