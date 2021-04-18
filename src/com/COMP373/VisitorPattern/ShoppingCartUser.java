package com.COMP373.VisitorPattern;

// visitor pattern example use for each type of item

public class ShoppingCartUser {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book(20, "1111"), new Book(100, "2222"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")
        };

        int total = calcPrice(items);
        System.out.println("Total Cost = " + total);
    }

    private static int calcPrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(ItemElement item: items) {
            sum = sum + item.accept(visitor);
        }

        return sum;
    }
}
