package ua.edu.ucu.apps.flower_store_web.order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower_store_web.item.Item;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RoseFlower;
import ua.edu.ucu.apps.flower_store_web.order.strategy.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flower_store_web.order.strategy.payment.PayPalPaymentStrategy;

import java.util.Random;

class OrderTest {
    Order order;
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private final double price = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
    @BeforeEach
    void setUp() {
        order = new Order();
        order.setDeliveryStrategy(new  DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        Item flower = new RoseFlower(price);
        order.addItem(flower);
        flower = new RoseFlower(price);
        order.addItem(flower);
        flower = new RoseFlower(price);
        order.addItem(flower);
    }

    @Test
    void calculateTotalPrice() {

        System.out.println(order.calculateTotalPrice());
        Assertions.assertEquals(3*price+20+order.getItems().size(),
                                        order.calculateTotalPrice());
    }

    @Test
    void processOrder() {
        order.processOrder();
    }

    @Test
    void getDescription() {
        System.out.println(order.toString());
    }

    @Test
    void removeItem() {
        Item flower = new RoseFlower(price);
        order.removeItem(flower);
        System.out.println(order);
    }
}