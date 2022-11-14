package ua.edu.ucu.apps.flower_store_web.item.flower;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * stores general data about a flower
 */

@Getter @Setter @ToString
public class FlowerSpec {

    private FlowerType flowerType;
    private FlowerColor color;
    private double sepalLength;
    /**
     * constructor
     */
    public FlowerSpec() { }
    /**
     * handles input
     * @param clr color of the flower
     */
    public void setColor(FlowerColor clr) {
        color = clr;
    }

    /**
     * handles input
     * @param clr color of the flower
     */
    public void setColor(String clr) {
        color = FlowerColor.fromString(clr);
    }



}
