package com.example.homework;

public class Product {
    int idProduct;
    String nameProduct;
    int priceProduct;

    public Product(int idProduct, String nameProduct, int priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    @Override
    public String toString() {
        return "Id = " + idProduct + ", name = '" + nameProduct + ", price = " + priceProduct;
    }
}