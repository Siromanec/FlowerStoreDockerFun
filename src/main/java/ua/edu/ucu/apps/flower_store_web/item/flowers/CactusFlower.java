package ua.edu.ucu.apps.flower_store_web.item.flowers;

import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerColor;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerType;

public class CactusFlower extends Flower {
    public CactusFlower(double price) {
        super(price, FlowerColor.PINK, 0.5);
        setFlowerType(FlowerType.CACTUS);
    }
}
