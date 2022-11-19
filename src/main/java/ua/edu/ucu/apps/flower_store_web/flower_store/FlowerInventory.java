package ua.edu.ucu.apps.flower_store_web.flower_store;


import lombok.Getter;
import ua.edu.ucu.apps.flower_store_web.flower_store.search.FlowerSearchEngine;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerSpec;

import java.util.ArrayList;

import java.util.List;

/**
 * flower inventory. here we store our flowers
 */
public final class FlowerInventory {
    @Getter
    private final List<Flower> inventory = new ArrayList<>();
    private static FlowerInventory instance;

    /**
     * constructor for flower inventory
     * currently has only three flowers
     */
    private FlowerInventory() {

    }

    /**
     * adds flowers to inventory
     * @param flower flower user wants to add
     */
    public void addFlower(Flower flower) {
        inventory.add(flower);
    }
    /**
     * search tool to find flowers in the inventory
     * @param searchSpec - is the specification for search
     * @return a list of flowers which fit the specification
     * */
    public List<Flower> search(FlowerSpec searchSpec) {
        return new FlowerSearchEngine().search(searchSpec, inventory);
    }

    public static FlowerInventory getInstance() {
        if (instance == null) {
            instance = new FlowerInventory();
        }
        return instance;
    }
}

