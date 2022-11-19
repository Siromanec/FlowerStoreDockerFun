package ua.edu.ucu.apps.flower_store_web.item.flowers;


import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerType;

/**
 * A red pretty tulip
 */
public class TulipFlower extends Flower {
    /**
     *  creates a beautiful tulip
     */
    public TulipFlower(double price) {
        super(price, FlowerColor.RED, 2);
        setFlowerType(FlowerType.TULIP);
    }
}
