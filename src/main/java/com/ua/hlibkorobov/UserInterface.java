package com.ua.hlibkorobov;

import com.ua.hlibkorobov.payment.PaymentStrategy;
import com.ua.hlibkorobov.products.Product;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    private PaymentStrategy paymentType;
    private List<Product> menu;

    public UserInterface() {
        menu = new ArrayList<>();
    }

    public void setPaymentType(PaymentStrategy paymentType) {
        this.paymentType = paymentType;
    }

    public void addProductToMenu(Product product){
        menu.add(product);
    }

    public void displayMenu() {
        for (Product product : menu) {
            System.out.println(product.getProductName() + " cost: " + product.getProductPrice());
        }
    }

    public String processPayment(double amount) {
        return paymentType.pay(amount);
    }
}
