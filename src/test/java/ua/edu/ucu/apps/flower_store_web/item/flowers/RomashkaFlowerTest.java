package ua.edu.ucu.apps.flower_store_web.item.flowers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerColor;

import java.util.Random;

public class RomashkaFlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private int price;


    /**
     * setup
     */
    @BeforeEach
    public void init() {
        price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower = new RomashkaFlower(price);
    }

    /**
     * test price
     */
    @Test
    public void testPrice() {
        Assertions.assertEquals(price, flower.price());
    }

    /**
     * test color
     */
    @Test
    public void testColor() {
        Assertions.assertEquals(FlowerColor.WHITE, flower.getColor());
    }
}