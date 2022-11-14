package ua.edu.ucu.apps.flower_store_web.flower_store.search;

import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerSpec;

import java.util.List;

public interface SearchEngine {
    List<Flower> search(FlowerSpec searchSpec, List<Flower> inventory);

}
