package ua.edu.ucu.apps.flower_store_web.item.pack;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flower_store_web.item.Item;
import ua.edu.ucu.apps.flower_store_web.item.flower.Flower;

/**
 * flower pack
 */
@Getter @Setter
public class FlowerPack extends Item {

    private final Flower flower;
    private int quantity;
    /**
     *  flowerpack constructor
     * @param flower flower type the user wants to make a pack of
     * @param quantity amount of the flowers in a pack
     *
     */
    public FlowerPack(final Flower flower,
                      final int quantity) {
        this.flower = flower;
        this.quantity = quantity;

    }

    public void addFlower(){
        quantity += 1;
    }
    public void addFlower(int quantity){
        this.quantity += quantity;
    }
    /**
     * get price for all flowers in a pack
     * @return the price of this amount of flowers
     */

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        return toString();
    }

    @Override
    public String toString() {
        return "FlowerPack{" +
                "flower=" + flower +
                ", quantity=" + quantity +
                '}';
    }
}
