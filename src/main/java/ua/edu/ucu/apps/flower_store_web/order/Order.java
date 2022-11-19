package ua.edu.ucu.apps.flower_store_web.order;

import lombok.Getter;
import ua.edu.ucu.apps.flower_store_web.item.Item;
import ua.edu.ucu.apps.flower_store_web.order.strategy.delivery.Delivery;
import ua.edu.ucu.apps.flower_store_web.order.strategy.payment.Payment;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private final List<Item> items = new ArrayList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    /**
     * fees by payment system(price for all items + delivery fees)
     * @return total price
     */
    public double calculateTotalPrice() {
        return payment.fees(items
                    .stream()
                    .mapToDouble(Item::price)
                    .reduce(0.0,
                        Double::sum)
                    + delivery.fees(items));
    }
    public void processOrder() {

        getPayment().pay(calculateTotalPrice());
        delivery.deliver(getItems());

    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {

        items.removeIf(orderItem -> orderItem.getDescription().equals(item.getDescription()));
    }
    @Override
    public String toString() {
        return "Order{"
                + "items="
                + items
                + ", payment="
                + payment
                + ", delivery="
                + delivery
                + "}";
    }
}
