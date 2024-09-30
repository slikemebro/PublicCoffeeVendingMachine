package com.ua.hlibkorobov.payment;

public class MobilePayment implements PaymentStrategy {
    @Override
    public String pay(double paymentAmount) {
        return "Paid by mobile " + paymentAmount;
    }
}
