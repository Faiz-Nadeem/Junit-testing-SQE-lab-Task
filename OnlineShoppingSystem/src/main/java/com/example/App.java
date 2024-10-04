package com.example;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Sample operations
        cart.addToCart("Laptop");
        cart.addToFavorites("Smartphone");

        System.out.println("Cart items: " + cart.getCartItems());
        System.out.println("Favorite items: " + cart.getFavoriteItems());

        cart.checkout();
        System.out.println("Cart after checkout: " + cart.getCartItems());
    }
}
