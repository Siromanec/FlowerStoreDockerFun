package ua.edu.ucu.apps.flower_store_web.item.flower;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flower_store_web.item.Item;

/**
 * Flowers. We sell them
 */

public abstract class Flower extends Item {
    @Getter
    private final FlowerSpec spec = new FlowerSpec();
    @Getter @Setter
    private double price;



    /**
     * constructor with parameters
     * @param price price
     * @param color color
     * @param sepalLength sepalLength
     */
    public Flower(double price,
                  FlowerColor color,
                  double sepalLength) {
        setPrice(price);
        spec.setColor(color);
        spec.setSepalLength(sepalLength);
    }

    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return toString();
    }

    @Override
    public String toString() {

        return getSpec().getFlowerType().toString() +
                "{" +
                "color='" + getSpec().getColor()+ "'" +
                ", sepalLength=" + getSpec().getSepalLength() +
                ", price=" + getPrice() +
                "}";
    }


}
