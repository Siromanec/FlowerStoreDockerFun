package ua.edu.ucu.apps.flower_store_web.order.strategy.payment;

import lombok.Getter;

public class CreditCardPaymentStrategy implements Payment{
    @Getter
    private final static double STEALING_COEF = 1.03;
    /**
     * pay the price
     * @param price price you have to pay
     */
    @Override
    public void pay(double price) {

    }

    /**
     * steal 3% of your money
     * @param totalPrice totalPrice
     * @return totalPrice with fees
     */
    @Override
    public double fees(double totalPrice) {
        return totalPrice*STEALING_COEF;
    }

    @Override
    public String toString() {
        return "CreditCardPayment";
    }
}
