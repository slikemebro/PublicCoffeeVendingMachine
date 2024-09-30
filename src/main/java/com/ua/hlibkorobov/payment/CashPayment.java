package com.ua.hlibkorobov.payment;

public class CashPayment implements PaymentStrategy{
    @Override
    public String pay(double paymentAmount) {
        return "Paid by cash " + paymentAmount;
    }
}
