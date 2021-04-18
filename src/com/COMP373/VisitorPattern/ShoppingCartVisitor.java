package com.COMP373.VisitorPattern;

// visitor interface
// method for the different types of items to be implemented by the concrete visitor class

public interface ShoppingCartVisitor {
    int visit(Fruit fruit);
    int visit(Book book);

}
