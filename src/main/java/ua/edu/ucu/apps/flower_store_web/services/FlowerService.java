package ua.edu.ucu.apps.flower_store_web.services;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.flower_store_web.flower_store.FlowerInventory;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.CactusFlower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RomashkaFlower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.TulipFlower;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        FlowerInventory flowerInventory = FlowerInventory.getInstance();
        flowerInventory.addFlower(new RomashkaFlower(10));
        flowerInventory.addFlower(new RomashkaFlower(10));
        flowerInventory.addFlower(new RomashkaFlower(10));
        flowerInventory.addFlower(new TulipFlower(30));
        flowerInventory.addFlower(new TulipFlower(30));
        flowerInventory.addFlower(new CactusFlower(100));

        return flowerInventory.getInventory();
    }
}
