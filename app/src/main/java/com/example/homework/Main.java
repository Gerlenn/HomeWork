package com.example.homework;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.insertProduct(1, new Product(1, "Apple", 35));
        shop.insertProduct(2, new Product(2, "Banana", 20));
        shop.insertProduct(3, new Product(3, "Orange", 15));
        shop.insertProduct(3, new Product(3, "Kiwi", 50));
        shop.insertProduct(4, new Product(4, "Avocado", 100));
        shop.insertProduct(5, new Product(5, "Lime", 70));
        shop.insertProduct(6, new Product(6, "Mango", 200));

        shop.listOfProduct();//list of products
        shop.sortProduct();//list of products by price
        shop.deleteProduct(5);//deleting products
        shop.sortProductInOrderOfAddition();//sorting of products by order of addition
        shop.changeProduct(1, new Product(1, "Grapes", 80));//changing products
        shop.listOfProduct();//list of products
    }
}