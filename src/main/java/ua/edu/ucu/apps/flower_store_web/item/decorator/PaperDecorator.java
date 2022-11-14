package ua.edu.ucu.apps.flower_store_web.item.decorator;

import lombok.Getter;
import ua.edu.ucu.apps.flower_store_web.item.Item;

public class PaperDecorator extends ItemDecorator {
    @Getter
    static private final double DECORATOR_COST = 13;
    private final Item item;
    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " with PaperDecorator{decoratorCost="+DECORATOR_COST+"}";
    }

    public double getPrice() {
        return DECORATOR_COST + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }
}
