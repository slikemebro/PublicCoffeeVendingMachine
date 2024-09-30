package com.ua.hlibkorobov.products;

public abstract class Product {
    private String productName;
    private double productPrice;

    public String getProductName(){
        return productName;
    };

    public double getProductPrice(){
        return productPrice;
    };

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
