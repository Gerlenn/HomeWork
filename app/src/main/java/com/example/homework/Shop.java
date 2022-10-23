package com.example.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Shop {
    static Map<Integer, Product> productListShop = new HashMap<>();

    public void insertProduct(Integer id, Product product) {
        if (productListShop.containsKey(id)) {
            System.out.println("Such a product already exists\n");
        } else {
            productListShop.put(product.idProduct, new Product(product.getIdProduct(), product.getNameProduct(), product.getPriceProduct()));
        }
    }

    public void listOfProduct() {
        System.out.println("List of products:");
        for (Product str : productListShop.values())
            System.out.println(str);
    }

    public void deleteProduct(int idProduct) {
        productListShop.remove(idProduct);
        System.out.println("The product has been removed\n");
    }

    public void changeProduct(int productID, Product product) {
        productListShop.replace(productID, product);
        System.out.println("The product has been changed\n");
    }

    public void sortProduct() {
        List sortProductList = new ArrayList(productListShop.values());
        Collections.sort(sortProductList, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return Integer.valueOf(product.getPriceProduct()).compareTo(
                        Integer.valueOf(t1.getPriceProduct())
                );
            }
        });
        System.out.println("Sorted by price\n");
        for (Object str : sortProductList)
            System.out.println(str);
    }

    public void sortProductInOrderOfAddition() {
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator iterator = Shop.productListShop.values().iterator();
        System.out.println("Sorted by the order of addition\n");
        while (iterator.hasNext()) {
            Object desIterator = iterator.next();
            arrayDeque.addFirst(desIterator);
        }

        for (Object str : arrayDeque)
            System.out.println(str);
    }
}