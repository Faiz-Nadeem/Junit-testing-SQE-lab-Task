package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroceryService {
    private List<Product> productList;

    public GroceryService() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public List<Product> getProducts() {
        return productList;
    }

    public List<Product> sortProductsByName() {
        Collections.sort(productList, Comparator.comparing(Product::getName));
        return productList;
    }

    public List<Product> sortProductsByPrice() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
        return productList;
    }
}
