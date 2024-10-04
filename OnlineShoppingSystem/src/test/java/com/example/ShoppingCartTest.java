package com.example;

import junit.framework.TestCase;

public class ShoppingCartTest extends TestCase {

    private ShoppingCart shoppingCart;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        shoppingCart = new ShoppingCart(); // Initialize the ShoppingCart instance
    }

    public void testAddToCart() {
        String item = "Laptop";

        shoppingCart.addToCart(item);

        assertTrue(shoppingCart.getCartItems().contains(item)); // Check if the item was added
    }

    public void testRemoveFromCart() {
        String item = "Laptop";

        shoppingCart.addToCart(item);
        shoppingCart.removeFromCart(item);

        assertFalse(shoppingCart.getCartItems().contains(item)); // Check if the item was removed
    }

    public void testAddToFavorites() {
        String item = "Smartphone";

        shoppingCart.addToFavorites(item);

        assertTrue(shoppingCart.getFavoriteItems().contains(item)); // Check if the item was added to favorites
    }

    public void testCheckout() {
        shoppingCart.addToCart("Laptop");

        shoppingCart.checkout();

        assertTrue(shoppingCart.getCartItems().isEmpty()); // Check if cart is empty after checkout
    }
}
