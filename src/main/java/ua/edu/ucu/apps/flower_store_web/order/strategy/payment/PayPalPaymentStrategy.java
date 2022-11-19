package ua.edu.ucu.apps.flower_store_web.order.strategy.payment;

public class PayPalPaymentStrategy implements Payment{
    /**
     * pay the price
     * @param price price you have to pay
     */
    @Override
    public void pay(double price) {

    }

    /**
     * tax evasion
     * @param totalPrice the totalPrice
     * @return the no tax sum
     */
    @Override
    public double fees(double totalPrice) {
        return totalPrice;
    }
    @Override
    public String toString() {
        return "PayPalPayment";
    }
}
