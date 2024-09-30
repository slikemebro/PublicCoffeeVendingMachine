package com.ua.hlibkorobov;

import com.ua.hlibkorobov.payment.CardPayment;
import com.ua.hlibkorobov.payment.PaymentStrategy;
import com.ua.hlibkorobov.products.CocaCola;
import com.ua.hlibkorobov.products.Fanta;
import com.ua.hlibkorobov.products.Product;
import com.ua.hlibkorobov.products.Snickers;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Product first = new CocaCola();
        Product second = new Fanta();
        Product third = new Snickers();


        UserInterface userInterface = new UserInterface();

        userInterface.addProductToMenu(first);
        userInterface.addProductToMenu(second);
        userInterface.addProductToMenu(third);

        PaymentStrategy paymentStrategy = new CardPayment();
        userInterface.setPaymentType(paymentStrategy);

        userInterface.displayMenu();
        System.out.println(userInterface.processPayment(5));
    }
}
