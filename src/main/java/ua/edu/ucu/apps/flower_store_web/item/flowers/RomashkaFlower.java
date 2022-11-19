package ua.edu.ucu.apps.flower_store_web.item.flowers;


import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerType;

/**
 * the chamomile
 */
public class RomashkaFlower extends Flower {
    /**
     * creates a white chamomile
     */
    public RomashkaFlower(double price) {
        super(price, FlowerColor.WHITE, 1.2);
        setFlowerType(FlowerType.ROMASHKA);
    }
}
