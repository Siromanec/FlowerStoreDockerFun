package ua.edu.ucu.apps.flower_store_web.item.flowers;

import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerType;

/**
 * the rose flower
 */
public class RoseFlower extends Flower {
    /**
     * creates a red rose
     */
    public RoseFlower(double price) {
        super(price, FlowerColor.RED, 4);
        setFlowerType(FlowerType.ROSE);
    }
}
