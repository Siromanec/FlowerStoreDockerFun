
package ua.edu.ucu.apps.flower_store_web.item.bucket;

import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;
import ua.edu.ucu.apps.flower_store_web.item.flower.FlowerSpec;
import ua.edu.ucu.apps.flower_store_web.item.pack.FlowerPack;
import ua.edu.ucu.apps.flower_store_web.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * bucket
 * */

public class FlowerBucket extends Item {

    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    /**
     * constructor
     */
    public FlowerBucket() { }

    /**
     * adds flowerpacks to bucket
     * @param fp flower pack
     */
    public void addFlowers(Flower fp) {
        FlowerPack flowerPack = searchFlower(fp.getSpec());
        if (flowerPack!=null) {
            flowerPack.addFlower();
        }
        else {
            flowerPacks.add(new FlowerPack(fp, 1));
        }
    }
    public void addFlowers(FlowerPack fp) {
        FlowerPack flowerPack = searchFlower(fp.getFlower().getSpec());
        if (flowerPack!=null) {
            flowerPack.addFlower(fp.getQuantity());
        }
        else {
            flowerPacks.add(fp);
        }
    }
    public FlowerPack searchFlower(FlowerSpec searchSpec) {

        List<FlowerPack> flowerPackList = flowerPacks.stream()
                .filter(flowerPack ->
                        ((flowerPack.getFlower().getSpec().getColor()
                                ==searchSpec.getColor()))
                                &&
                        (flowerPack.getFlower().getSpec().getSepalLength()
                                ==searchSpec.getSepalLength()))
                .toList();
        if (!flowerPackList.isEmpty()) {
            return flowerPackList.get(0);
        }
        return null;
//          !(new FlowerSearchEngine()
//                .search(searchSpec,
//                        flowerPacks
//                                .stream()
//                                .map(FlowerPack::getFlower)
//                                .collect(Collectors.toList()))
//                 .isEmpty());

    }

    @Override
    public double price() {
        return flowerPacks
                .stream()
                .mapToDouble(FlowerPack::getPrice)
                .reduce(0.0,Double::sum);
    }

    /**
     *
     * @return string representation of flower bucket
     */
    @Override
    public String toString() {
        return flowerPacks.stream().toString();
    }
}
