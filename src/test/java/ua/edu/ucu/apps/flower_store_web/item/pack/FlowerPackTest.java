package ua.edu.ucu.apps.flower_store_web.item.pack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RoseFlower;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_INCREMENT = 100;
    private static final int MAX_PRICE = 100;


    private FlowerPack flowerPack;
    private Flower flower;
    private double price;
    private int quantity;
    private int increment;
    @BeforeEach
    void setUp() {
        price = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        increment = RANDOM_GENERATOR.nextInt(MAX_INCREMENT);
        flower = new RoseFlower(price);
        flowerPack = new FlowerPack(flower, quantity);
    }

    @Test
    void addFlower() {
        flowerPack.addFlower();
        Assertions.assertEquals(flowerPack.getQuantity(), quantity+1);
    }

    @Test
    void testAddFlower() {
        flowerPack.addFlower(increment);
        Assertions.assertEquals(flowerPack.getQuantity(), quantity+increment);
    }

    @Test
    void price() {
        assertEquals(flowerPack.price(), quantity * price);
    }

    @Test
    void getFlower() {
        Assertions.assertEquals(flowerPack.getFlower(), flower);
    }

    @Test
    void getQuantity() {
        Assertions.assertEquals(quantity, flowerPack.getQuantity());
    }

    @Test
    void setQuantity() {
        flowerPack.setQuantity(increment);
        Assertions.assertEquals(increment, flowerPack.getQuantity());

    }
    @Test
    void getDescription() {
        Assertions.assertEquals("FlowerPack{" +
                "flower=" + flower +
                ", quantity=" + quantity +
                '}', flowerPack.getDescription());
    }
}