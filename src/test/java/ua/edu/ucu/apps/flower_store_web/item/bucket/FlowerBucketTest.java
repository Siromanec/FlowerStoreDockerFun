package ua.edu.ucu.apps.flower_store_web.item.bucket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RomashkaFlower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RoseFlower;
import ua.edu.ucu.apps.flower_store_web.item.pack.FlowerPack;

import java.util.Random;

class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;
    private Flower flower;

    private double price;
    private int quantity;

    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();
        price = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
        quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
    }
    @Test
    void addFlowerByOne() {
        flower = new RomashkaFlower(price/2);
        flowerBucket.addFlowers(flower);
        Assertions.assertEquals(flowerBucket.price(), price/2);
        flower = new RomashkaFlower(price/2);
        flowerBucket.addFlowers(flower);
        Assertions.assertEquals(flowerBucket.price(), price);

    }
    @Test
    void addFlowerByPack() {
        flower = new RomashkaFlower(price/2);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowers(flowerPack);
        Assertions.assertEquals(flowerBucket.price(), quantity*price/2);
        flower = new RomashkaFlower(price/2);
        flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowers(flowerPack);
        Assertions.assertEquals(flowerBucket.price(), quantity*price);
    }

    @Test
    void searchFlower() {
        flower = new RomashkaFlower(price/2);
        flowerBucket.addFlowers(flower);
        Assertions.assertEquals(flower.getSpec(), flowerBucket.searchFlower(flower.getSpec()).getFlower().getSpec());
        flower = new RoseFlower(price);
        Assertions.assertNull(flowerBucket.searchFlower(flower.getSpec()));

    }

    @Test
    public void price() {
        for (int i = 0; i < quantity; ++i) {
            flower = new RoseFlower(price);
            flowerBucket.addFlowers(flower);
        }
        for (int i = 0; i < quantity/2; ++i) {
            flower = new RomashkaFlower(price/2);
            flowerBucket.addFlowers(flower);
        }
        Assertions.assertEquals(price * quantity + (price/2)*(quantity/2), flowerBucket.price());
    }
    @Test
    public void toStringTest() {
        flower = new RomashkaFlower(price/2);
        flowerBucket.addFlowers(flower);
        flower = new RoseFlower(price);
        flowerBucket.addFlowers(flower);

        Assertions.assertEquals("[FlowerPack{flower=Romashka{color='white', sepalLength=1.2, price="
                +price/2
                +"}, quantity=1}, FlowerPack{flower=Rose{color='red', sepalLength=4.0, price="
                +price
                +"}, quantity=1}]", flowerBucket.toString());
    }
}