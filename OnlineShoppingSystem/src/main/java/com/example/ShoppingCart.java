package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<String> cartItems = new ArrayList<>();
    private List<String> favoriteItems = new ArrayList<>();

    // Adds an item to the shopping cart
    public void addToCart(String item) {
        cartItems.add(item);
    }

    // Removes an item from the shopping cart
    public void removeFromCart(String item) {
        cartItems.remove(item);
    }

    // Adds an item to the favorites list
    public void addToFavorites(String item) {
        favoriteItems.add(item);
    }

    // Checkout and clear the cart
    public void checkout() {
        // Process checkout logic here (if needed)
        cartItems.clear(); // Clear the cart after checkout
    }

    // Get the list of items in the cart
    public List<String> getCartItems() {
        return cartItems;
    }

    // Get the list of favorite items
    public List<String> getFavoriteItems() {
        return favoriteItems;
    }
}
