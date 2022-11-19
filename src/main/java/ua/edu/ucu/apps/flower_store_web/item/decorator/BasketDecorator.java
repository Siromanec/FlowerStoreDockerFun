package ua.edu.ucu.apps.flower_store_web.item.decorator;

import lombok.Getter;
import ua.edu.ucu.apps.flower_store_web.item.Item;

public class BasketDecorator extends ItemDecorator {
    @Getter
    static private final double DECORATOR_COST = 4;
    private final Item item;
    public BasketDecorator(Item item) {
        this.item = item;
    }
    @Override
    public String getDescription() {
        return item.getDescription() + " with BasketDecorator{decoratorCost="+DECORATOR_COST+"}";
    }

    public double getPrice() {
        return 4 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }
}
