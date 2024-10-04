package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroceryServiceTest {
    private GroceryService groceryService;

    @BeforeEach
    void setUp() {
        groceryService = new GroceryService();
    }

    @Test
    void testAddProduct() {
        Product product = new Product("Apple", 0.99);
        groceryService.addProduct(product);
        
        List<Product> products = groceryService.getProducts();
        assertEquals(1, products.size());
        assertEquals("Apple", products.get(0).getName());
    }

    @Test
    void testRemoveProduct() {
        Product product = new Product("Banana", 0.59);
        groceryService.addProduct(product);
        groceryService.removeProduct(product);
        
        List<Product> products = groceryService.getProducts();
        assertEquals(0, products.size());
    }

    @Test
    void testSortProductsByName() {
        groceryService.addProduct(new Product("Orange", 0.79));
        groceryService.addProduct(new Product("Apple", 0.99));
        groceryService.addProduct(new Product("Banana", 0.59));
        
        List<Product> sortedProducts = groceryService.sortProductsByName();
        assertEquals("Apple", sortedProducts.get(0).getName());
        assertEquals("Banana", sortedProducts.get(1).getName());
        assertEquals("Orange", sortedProducts.get(2).getName());
    }

    @Test
    void testSortProductsByPrice() {
        groceryService.addProduct(new Product("Orange", 0.79));
        groceryService.addProduct(new Product("Apple", 0.99));
        groceryService.addProduct(new Product("Banana", 0.59));
        
        List<Product> sortedProducts = groceryService.sortProductsByPrice();
        assertEquals("Banana", sortedProducts.get(0).getName());
        assertEquals("Orange", sortedProducts.get(1).getName());
        assertEquals("Apple", sortedProducts.get(2).getName());
    }
}
