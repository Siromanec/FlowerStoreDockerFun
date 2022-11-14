package ua.edu.ucu.apps.flower_store_web.services;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.CactusFlower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.RomashkaFlower;
import ua.edu.ucu.apps.flower_store_web.item.flowers.TulipFlower;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(
                new RomashkaFlower(10),
                new TulipFlower(30),
                new CactusFlower(100));
    }
}
