package com.ua.hlibkorobov.payment;

public class CardPayment implements PaymentStrategy{
    @Override
    public String pay(double paymentAmount) {
        return "Paid by card " + paymentAmount;
    }
}
