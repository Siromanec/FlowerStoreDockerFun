package ua.edu.ucu.apps.flower_store_web.order.strategy.delivery;

import ua.edu.ucu.apps.flower_store_web.item.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {

    }

    @Override
    public double fees(List<Item> items) {
        return items.size() + 20;
    }
    @Override
    public String toString() {
        return "DHLDelivery";
    }
}
