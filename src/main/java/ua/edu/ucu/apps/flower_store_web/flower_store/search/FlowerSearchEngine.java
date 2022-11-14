package ua.edu.ucu.apps.flower_store_web.flower_store.search;

import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerSpec;

import java.util.ArrayList;
import java.util.List;

public class FlowerSearchEngine implements SearchEngine {
    public List<Flower> search(FlowerSpec searchSpec, List<Flower> inventory) {

        List<Flower> matchingFlowers = new ArrayList<>();
        FlowerSpec flowerSpec;
        for (Flower flower : inventory) {
            flowerSpec = flower.getSpec();
            if (searchSpec.getFlowerType()!=flowerSpec.getFlowerType()) {
                continue;
            }
            if (searchSpec.getColor() != flowerSpec.getColor()) {
                continue;
            }
            if (searchSpec.getSepalLength() != flowerSpec.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }

}
